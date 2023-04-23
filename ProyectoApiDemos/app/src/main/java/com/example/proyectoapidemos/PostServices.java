package com.example.proyectoapidemos;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface PostServices {
    String API_ROUT = "/post";

    @GET(API_ROUT)
    Call<List<Post>> getPost();
}
