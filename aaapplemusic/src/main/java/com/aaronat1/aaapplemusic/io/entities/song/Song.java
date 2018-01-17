package com.aaronat1.aaapplemusic.io.entities.song;

import com.aaronat1.aaapplemusic.io.entities.album.AlbumData;

import java.util.List;

import lombok.Data;

/**
 * Created by aaronasencio on 9/1/18.
 */

@Data
public class Song {

    private List<SongData> data;

    public SongData getSong() {
        if (data != null && data.size() > 0) {
            return data.get(0);
        } else {
            return null;
        }
    }
}
