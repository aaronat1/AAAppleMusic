package com.aaronat1.aaapplemusic.io.entities.musicvideo;

import java.util.List;

import lombok.Data;

/**
 * Created by aaronasencio on 9/1/18.
 */

@Data
public class MusicVideo {

    private List<MusicVideoData> data;

    public MusicVideoData getMusicVideo() {
        if (data != null && data.size() > 0) {
            return data.get(0);
        } else {
            return null;
        }
    }
}
