package com.aaronat1.aaapplemusic.io.entities.chart;

import com.aaronat1.aaapplemusic.io.entities.Relationships;
import com.aaronat1.aaapplemusic.io.entities.album.Albums;
import com.aaronat1.aaapplemusic.io.entities.song.SongData;
import com.aaronat1.aaapplemusic.io.entities.song.Songs;

import java.util.List;

import lombok.Data;

/**
 * Created by aaronasencio on 9/1/18.
 */

@Data
public class SongsData {

    private String chart;

    private List<SongData> data;

    private String href;

    private String name;

    private String next;


}
