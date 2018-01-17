package com.aaronat1.aaapplemusic.io.entities;

import java.util.List;

import lombok.Data;

/**
 * Created by aaronasencio on 9/1/18.
 */

@Data
public class AtributesTrack {

    private String artistName;

    private String composerName;

    private int discNumber;

    private long durationInMillis;

    private String isrc;

    private String name;

    private String releaseDate;

    private int trackNumber;

    private String url;

}
