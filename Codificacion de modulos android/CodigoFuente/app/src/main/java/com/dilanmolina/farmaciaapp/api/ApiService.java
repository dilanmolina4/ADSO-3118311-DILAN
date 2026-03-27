package com.dilanmolina.farmaciaapp.api;

import com.dilanmolina.farmaciaapp.model.Usuario;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    @POST("login")
    Call<Usuario> login(@Body Usuario usuario);

    @POST("register")
    Call<Usuario> register(@Body Usuario usuario);

}