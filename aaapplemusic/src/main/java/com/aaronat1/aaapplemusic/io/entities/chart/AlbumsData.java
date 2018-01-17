package com.aaronat1.aaapplemusic.io.entities.chart;


import com.aaronat1.aaapplemusic.io.entities.album.AlbumData;
import com.aaronat1.aaapplemusic.io.entities.album.Albums;

import java.util.List;

import lombok.Data;

/**
 * Created by aaronasencio on 9/1/18.
 */

@Data
public class AlbumsData {

    private String chart;

    private List<AlbumData> data;

    private String href;

    private String name;

    private String next;



}
