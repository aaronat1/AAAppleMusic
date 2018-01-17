package com.aaronat1.aaapplemusic.io.entities.chart;


import com.aaronat1.aaapplemusic.io.entities.artist.ArtistData;
import com.aaronat1.aaapplemusic.io.entities.musicvideo.MusicVideoData;
import com.aaronat1.aaapplemusic.io.entities.musicvideo.MusicVideos;

import java.util.List;

import lombok.Data;

/**
 * Created by aaronasencio on 9/1/18.
 */

@Data
public class Chart {

    private List<AlbumsData> albums;

    private List<SongsData> songs;

    private List<MusicVideoData> musicVideos;


}
