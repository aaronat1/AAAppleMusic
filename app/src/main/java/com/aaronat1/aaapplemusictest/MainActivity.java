package com.aaronat1.aaapplemusictest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.aaronat1.aaapplemusic.api.AAApleMusic;
import com.aaronat1.aaapplemusic.io.entities.search.Hint;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test();
    }

    public void test() {
        AAApleMusic.get().setToken("Bearer eyJhbGciOiJFUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IkFFTU5TMjlaMzUifQ.eyJpc3MiOiI4NDVONjgySkVDIiwiZXhwIjoxNTE2MTg0Mjg2LCJpYXQiOjE1MTYxODA2ODYyMTF9.hXNnfdAAHc_SaxbDqxGVRTvB_zl_bMp7lbX4xzEnGSRSpHxXHXTfafVNHyTNwOOXny5PObKkPPOlAKQStQDBBw");
        AAApleMusic.get().searchHint("us", "love", null, 10, null, null, new Callback<Hint>() {
                    @Override
                    public void onResponse(Call<Hint> call, Response<Hint> response) {
                        if (response.isSuccessful()) {
                            Log.e("OK: ", response.body().getResults().getTerms().get(2));
                        } else {
                            Log.e("ERROR: ", response.message());
                        }
                    }

                    @Override
                    public void onFailure(Call<Hint> call, Throwable t) {
                        Log.e("Error: ", "Getting genre error");
                    }
                });
    }

}

