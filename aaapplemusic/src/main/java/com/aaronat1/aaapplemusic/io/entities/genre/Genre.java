package com.aaronat1.aaapplemusic.io.entities.genre;

import com.aaronat1.aaapplemusic.io.entities.album.AlbumData;

import java.util.List;

import lombok.Data;

/**
 * Created by aaronasencio on 11/1/18.
 */

@Data
public class Genre {

    private List<GenreData> data;

    public GenreData getGenre() {
        if (data != null && data.size() > 0) {
            return data.get(0);
        } else {
            return null;
        }
    }

}
