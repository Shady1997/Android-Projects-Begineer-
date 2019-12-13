package com.shady191997.countryflag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.shady191997.countryflag.internet.APIterface;
import com.shady191997.countryflag.internet.RetrofitClient;
import com.shady191997.countryflag.models.Content;
import com.shady191997.countryflag.models.Country;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
TextView textView;
ImageView imageView;
Button button;
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);
        imageView=(ImageView)findViewById(R.id.img);
        button=(Button)findViewById(R.id.btn);
        editText=(EditText)findViewById(R.id.edittext);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadcountry();
            }
        });
    }

    private void loadcountry()
    {
        APIterface apIterface= RetrofitClient.getClient().create(APIterface.class);
        Call<Content> call=apIterface.getCountry();
        call.enqueue(new Callback<Content>() {
            @Override
            public void onResponse(Call<Content> call, Response<Content> response) {
                if(response.isSuccessful())
                {
                    Content content=response.body();
                   Country country=content.getResponse().get(Integer.parseInt(editText.getText().toString()));
                   textView.setText(country.getName());
                    Glide.with(getApplicationContext())
                            .load(country.getFlagPng())
                            .into(imageView);
                }
                else
                {
                    int statuscode =response.code();
                    String msg=response.message();
                    Toast.makeText(getApplicationContext(),"Code is "+statuscode,Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<Content> call, Throwable t) {
                Log.i("Error msg ",t.getMessage());

            }
        });
    }
}
