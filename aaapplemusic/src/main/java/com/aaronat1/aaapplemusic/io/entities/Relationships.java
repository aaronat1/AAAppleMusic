package com.aaronat1.aaapplemusic.io.entities;

import com.aaronat1.aaapplemusic.io.entities.album.Albums;
import com.aaronat1.aaapplemusic.io.entities.artist.Artist;

import lombok.Data;

/**
 * Created by aaronasencio on 9/1/18.
 */

@Data
public class Relationships {

    private Artist artists;

    private Tracks tracks;

    private Albums albums;

}
