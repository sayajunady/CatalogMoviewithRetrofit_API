package com.junadhi.catalogmovie.rest;

import com.junadhi.catalogmovie.model.Response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("/3/movie/{category}")
    Call<Response> getMovie(
            @Path("category") String category,
            @Query("api_key") String api_key,
            @Query("language") String language,
            @Query("age") int page
    );

    @GET("/3/search/movie")
    Call<Response> getQuery(
            @Query("api_key") String api_key,
            @Query("language") String language,
            @Query("query") String query,
            @Query("page") int page

    );
}
