package com.aaronat1.aaapplemusic.io.entities.curator;


import com.aaronat1.aaapplemusic.io.entities.artist.ArtistData;

import java.util.List;

import lombok.Data;

/**
 * Created by aaronasencio on 9/1/18.
 */

@Data
public class Curator {

    private List<ArtistData>  data;

    private String href;

    public ArtistData getCurator() {
        if (data != null && data.size() > 0) {
            return data.get(0);
        } else {
            return null;
        }
    }


}
