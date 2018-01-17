package com.aaronat1.aaapplemusic.io.entities;

import java.util.List;

import lombok.Data;

/**
 * Created by aaronasencio on 9/1/18.
 */

@Data
public class Attributes {

    private String artistName;

    private Artwork artwork;

    private String copyright;

    private EditorialNotes editorialNotes;

    private String [] genreNames;

    private boolean isComplete;

    private boolean isSingle;

    private String name;

    private PlayParams playParams;

    private String recordLabel;

    private String releaseDate;

    private int trackCount;

    private String url;

    private String composerName;

    private int discNumber;

    private long durationInMillis;

    private String isrc;

    private List<Preview> previews;

    private int trackNumber;


}


