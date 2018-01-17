package com.aaronat1.aaapplemusic.io.entities.search;


import com.aaronat1.aaapplemusic.io.entities.album.Album;
import com.aaronat1.aaapplemusic.io.entities.album.Albums;
import com.aaronat1.aaapplemusic.io.entities.artist.Artist;
import com.aaronat1.aaapplemusic.io.entities.artist.ArtistData;
import com.aaronat1.aaapplemusic.io.entities.artist.Artists;
import com.aaronat1.aaapplemusic.io.entities.chart.AlbumsData;
import com.aaronat1.aaapplemusic.io.entities.chart.SongsData;
import com.aaronat1.aaapplemusic.io.entities.curator.Curator;
import com.aaronat1.aaapplemusic.io.entities.curator.CuratorData;
import com.aaronat1.aaapplemusic.io.entities.curator.Curators;
import com.aaronat1.aaapplemusic.io.entities.musicvideo.MusicVideoData;
import com.aaronat1.aaapplemusic.io.entities.playlist.PlayList;
import com.aaronat1.aaapplemusic.io.entities.playlist.PlayListData;
import com.aaronat1.aaapplemusic.io.entities.playlist.PlayLists;
import com.aaronat1.aaapplemusic.io.entities.song.Song;
import com.aaronat1.aaapplemusic.io.entities.song.SongData;
import com.aaronat1.aaapplemusic.io.entities.song.Songs;
import com.aaronat1.aaapplemusic.io.entities.station.Station;
import com.aaronat1.aaapplemusic.io.entities.station.StationData;
import com.aaronat1.aaapplemusic.io.entities.station.Stations;

import java.util.List;

import lombok.Data;

/**
 * Created by aaronasencio on 9/1/18.
 */

@Data
public class Search {

    private Albums albums;

    private Songs songs;

    private Artists artists;

    private Curators curators;

    private PlayLists playLists;

    private Stations stations;


}
