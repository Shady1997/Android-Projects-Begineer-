package com.shady191997.countryflag.internet;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {


    private static Retrofit retrofit= null ;
    public static Retrofit getClient(){
        if(retrofit==null)
        {
            retrofit = new Retrofit.Builder().baseUrl("http://countryapi.gear.host/v1/country/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
