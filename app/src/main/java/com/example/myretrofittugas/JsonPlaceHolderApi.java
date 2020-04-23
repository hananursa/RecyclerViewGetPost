package com.example.myretrofittugas;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {
    @GET("Mahasiswa_mobile")
    Call<List<Post>> getPost();

    @GET("Mahasiswa_mobile")
    Call<List<Post>> getPostById(
            @Query("id") String id
    );
    @FormUrlEncoded
    @POST("Mahasiswa_mobile")
    Call<ResponseBody> setPost(
            @Field("id") String id, @Field("nama") String nama,
            @Field("alamat") String alamat,
            @Field("jenis_kelamin") String jenis_kelamin,
            @Field("no_telp") String no_telp
    );
}
