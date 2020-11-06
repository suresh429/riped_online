package com.journals.riped_online.network;

import android.content.Context;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {
   private static Retrofit retrofit = null;


    public static <S> S createService(Class<S> serviceClass,Context context) {
        if (retrofit == null) {

            OkHttpClient.Builder oktHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(new NetworkConnectionInterceptor(context));
            // Adding NetworkConnectionInterceptor with okHttpClientBuilder.

            retrofit = new Retrofit.Builder()
                    .baseUrl("https://www.riped-online.com/admin/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(oktHttpClient.build())
                    .build();

        }
        return retrofit.create(serviceClass);
    }
}
