package com.sae.taller.ejemplo2

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET


//URL a la que se conecta el servicio
private const val BASE_URL = "http://52.34.131.94/appify/"

private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

private val retrofit = Retrofit.Builder()
        //.addConverterFactory(MoshiConverterFactory.create(moshi))
        .addConverterFactory(ScalarsConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

//

//  Interfaz entre el servicio web y el código de la app

interface AppifyService {
    @GET("index.html")
    //para probar conexion con la api
    fun getMensajePrueba():
            //Callback que retorna una cadena de texto
            Call<String>

    //otro endpoint es users.php
    @GET("users.php?group=MBDD0419")
    fun getUserList():
    //Callback que retorna una cadena de texto
            Call<String>
}

object Api {
    val retrofitService: AppifyService by lazy {
        retrofit.create(AppifyService::class.java)
    }
}

//Objeto que contiene el status del servidor
data class ServiceStatus(
        val message:String
)
