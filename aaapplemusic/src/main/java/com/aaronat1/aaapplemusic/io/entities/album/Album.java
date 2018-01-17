package com.aaronat1.aaapplemusic.io.entities.album;

import java.util.List;

import lombok.Data;

/**
 * Created by aaronasencio on 9/1/18.
 */

@Data
public class Album {

    private List<AlbumData> data;

    public AlbumData getAlbum() {
        if (data != null && data.size() > 0) {
            return data.get(0);
        } else {
            return null;
        }
    }
}
