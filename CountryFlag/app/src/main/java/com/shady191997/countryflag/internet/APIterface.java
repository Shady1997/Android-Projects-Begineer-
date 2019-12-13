package com.shady191997.countryflag.internet;

import com.shady191997.countryflag.models.Content;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIterface {

    @GET("getCountries")
    Call<Content> getCountry();
//?PNativeLanguage=eng

}
