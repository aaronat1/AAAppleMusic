package com.aaronat1.aaapplemusic.io.entities.search;


import com.aaronat1.aaapplemusic.io.entities.album.Albums;
import com.aaronat1.aaapplemusic.io.entities.artist.Artists;
import com.aaronat1.aaapplemusic.io.entities.curator.Curators;
import com.aaronat1.aaapplemusic.io.entities.playlist.PlayLists;
import com.aaronat1.aaapplemusic.io.entities.song.Songs;
import com.aaronat1.aaapplemusic.io.entities.station.Stations;

import java.util.List;

import lombok.Data;

/**
 * Created by aaronasencio on 9/1/18.
 */

@Data
public class SearchHint {

    private List<String> terms;


}
