package com.aaronat1.aaapplemusic.io;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by aasencio on 9/1/18.
 */

public class AAApleMusicApiAdapter {

    private static AAApleMusicApiService API_SERVICE;
    public static String URL_APPLE = "https://api.music.apple.com";

    public static AAApleMusicApiService getApiService() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);

        if (API_SERVICE == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(URL_APPLE)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build())
                    .build();
            API_SERVICE = retrofit.create(AAApleMusicApiService.class);
        }

        return API_SERVICE;
    }


}
