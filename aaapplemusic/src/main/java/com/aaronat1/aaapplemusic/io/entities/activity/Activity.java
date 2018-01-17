package com.aaronat1.aaapplemusic.io.entities.activity;


import com.aaronat1.aaapplemusic.io.entities.artist.ArtistData;

import java.util.List;

import lombok.Data;

/**
 * Created by aaronasencio on 9/1/18.
 */

@Data
public class Activity {

    private List<ActivityData>  data;

    private String href;

    public ActivityData getActivity() {
        if (data != null && data.size() > 0) {
            return data.get(0);
        } else {
            return null;
        }
    }


}
