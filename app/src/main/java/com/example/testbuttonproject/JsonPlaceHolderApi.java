package com.example.testbuttonproject;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface JsonPlaceHolderApi {
    @GET("posts")
    Call<List<DisplayPostActivity>> getPost(
            @Query("userId") Integer[] userId,
            @Query("_sort") String sort,
            @Query("_order") String order
    );

    @GET("posts")
    Call<List<DisplayPostActivity>> getPost(
            @QueryMap Map<String, String> parameters
    );

    @PUT("posts/{id}")
    Call<DisplayPostActivity> putPost(@Path("id") int id, @Body DisplayPostActivity post);

    @PATCH("posts/{id}")
    Call<DisplayPostActivity> patchPost(@Path("id") int id, @Body DisplayPostActivity post);

    @DELETE("posts/{id}")
    Call<Void> deletePost(@Path("id") int id);

    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int postId);

    @GET
    Call<List<Comment>> getComments(@Url String url);

    @POST("posts")
    Call<DisplayPostActivity> createPost(@Body DisplayPostActivity post);

    @FormUrlEncoded
    @POST("posts")
    Call<DisplayPostActivity> createPost(
            @Field("user Id") int userId,
            @Field("title") String title,
            @Field("body") String text
            );

    @FormUrlEncoded
    @POST("posts")
    Call<DisplayPostActivity> createPost(@FieldMap Map<String, String> fields);

}
