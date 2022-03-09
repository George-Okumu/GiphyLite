package com.george.giphylite.network;

import com.george.giphylite.TrendingResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GiphyApi {
    @GET("trending")
    Call<TrendingResponse> getTrendingGifs(
            @Query("api_key") String api_key,
            @Query("limit") Integer limit
    );
}
