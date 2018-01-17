package com.aaronat1.aaapplemusic.api;

import com.aaronat1.aaapplemusic.io.AAApleMusicApiAdapter;
import com.aaronat1.aaapplemusic.io.entities.activity.Activities;
import com.aaronat1.aaapplemusic.io.entities.activity.Activity;
import com.aaronat1.aaapplemusic.io.entities.album.Album;
import com.aaronat1.aaapplemusic.io.entities.album.Albums;
import com.aaronat1.aaapplemusic.io.entities.applecurators.AppleCurator;
import com.aaronat1.aaapplemusic.io.entities.applecurators.AppleCurators;
import com.aaronat1.aaapplemusic.io.entities.artist.Artist;
import com.aaronat1.aaapplemusic.io.entities.artist.Artists;
import com.aaronat1.aaapplemusic.io.entities.chart.Charts;
import com.aaronat1.aaapplemusic.io.entities.curator.Curator;
import com.aaronat1.aaapplemusic.io.entities.curator.Curators;
import com.aaronat1.aaapplemusic.io.entities.genre.Genre;
import com.aaronat1.aaapplemusic.io.entities.genre.Genres;
import com.aaronat1.aaapplemusic.io.entities.musicvideo.MusicVideo;
import com.aaronat1.aaapplemusic.io.entities.musicvideo.MusicVideos;
import com.aaronat1.aaapplemusic.io.entities.playlist.PlayList;
import com.aaronat1.aaapplemusic.io.entities.playlist.PlayLists;
import com.aaronat1.aaapplemusic.io.entities.search.Hint;
import com.aaronat1.aaapplemusic.io.entities.search.Searches;
import com.aaronat1.aaapplemusic.io.entities.song.Song;
import com.aaronat1.aaapplemusic.io.entities.song.Songs;
import com.aaronat1.aaapplemusic.io.entities.station.Station;
import com.aaronat1.aaapplemusic.io.entities.station.Stations;
import com.aaronat1.aaapplemusic.io.entities.storefront.StoreFront;
import com.aaronat1.aaapplemusic.io.entities.storefront.StoreFronts;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

/**
 * Created by aaronasencio on 11/1/18.
 */

public class AAApleMusic {

    private static AAApleMusic self;

    private String token;

    public static AAApleMusic get() {
        return self == null ? self = new AAApleMusic() : self;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void getActivity(String storefront, String id, Callback<Activity> callback) {
        Call<Activity> call = AAApleMusicApiAdapter.getApiService().getActivity(token, storefront, id);
        call.enqueue(callback);
    }

    public void getActivity(String storefront, String id, String language, Callback<Activity> callback) {
        Call<Activity> call = AAApleMusicApiAdapter.getApiService().getActivity(token, storefront, id, language);
        call.enqueue(callback);
    }

    public void getMultipleActivity(String storefront, List<String> ids, Callback<Activities> callback) {
        String formatIds = "";
        for (String id : ids) {
            formatIds = formatIds + id + ",";
        }
        formatIds = formatIds.substring(0, formatIds.lastIndexOf(","));
        Call<Activities> call = AAApleMusicApiAdapter.getApiService().getMultipleActivity(token, storefront, formatIds);
        call.enqueue(callback);
    }

    public void getMultipleActivity(String storefront, List<String> ids, String language, Callback<Activities> callback) {
        String formatIds = "";
        for (String id : ids) {
            formatIds = formatIds + id + ",";
        }
        formatIds = formatIds.substring(0, formatIds.lastIndexOf(","));
        Call<Activities> call = AAApleMusicApiAdapter.getApiService().getMultipleActivity(token, storefront, formatIds, language);
        call.enqueue(callback);
    }

    public void getAlbum(String storefront, String id, Callback<Album> callback) {
        Call<Album> call = AAApleMusicApiAdapter.getApiService().getAlbum(token, storefront, id);
        call.enqueue(callback);
    }

    public void getAlbum(String storefront, String id, String language, Callback<Album> callback) {
        Call<Album> call = AAApleMusicApiAdapter.getApiService().getAlbum(token, storefront, id, language);
        call.enqueue(callback);
    }

    public void getMultipleAlbum(String storefront, List<String> ids, Callback<Albums> callback) {
        String formatIds = "";
        for (String id : ids) {
            formatIds = formatIds + id + ",";
        }
        formatIds = formatIds.substring(0, formatIds.lastIndexOf(","));
        Call<Albums> call = AAApleMusicApiAdapter.getApiService().getMultipleAlbum(token, storefront, formatIds);
        call.enqueue(callback);
    }

    public void getMultipleAlbum(String storefront, List<String> ids, String language, Callback<Albums> callback) {
        String formatIds = "";
        for (String id : ids) {
            formatIds = formatIds + id + ",";
        }
        formatIds = formatIds.substring(0, formatIds.lastIndexOf(","));
        Call<Albums> call = AAApleMusicApiAdapter.getApiService().getMultipleAlbum(token, storefront, formatIds, language);
        call.enqueue(callback);
    }

    public void getAppleCurator(String storefront, String id, Callback<AppleCurator> callback) {
        Call<AppleCurator> call = AAApleMusicApiAdapter.getApiService().getAppleCurator(token, storefront, id);
        call.enqueue(callback);
    }

    public void getAppleCurator(String storefront, String id, String language, Callback<AppleCurator> callback) {
        Call<AppleCurator> call = AAApleMusicApiAdapter.getApiService().getAppleCurator(token, storefront, id, language);
        call.enqueue(callback);
    }

    public void getMultipleAppleCurator(String storefront, List<String> ids, Callback<AppleCurators> callback) {
        String formatIds = "";
        for (String id : ids) {
            formatIds = formatIds + id + ",";
        }
        formatIds = formatIds.substring(0, formatIds.lastIndexOf(","));
        Call<AppleCurators> call = AAApleMusicApiAdapter.getApiService().getMultipleAppleCurator(token, storefront, formatIds);
        call.enqueue(callback);
    }

    public void getMultipleAppleCurator(String storefront, List<String> ids, String language, Callback<AppleCurators> callback) {
        String formatIds = "";
        for (String id : ids) {
            formatIds = formatIds + id + ",";
        }
        formatIds = formatIds.substring(0, formatIds.lastIndexOf(","));
        Call<AppleCurators> call = AAApleMusicApiAdapter.getApiService().getMultipleAppleCurator(token, storefront, formatIds, language);
        call.enqueue(callback);
    }

    public void getArtist(String storefront, String id, Callback<Artist> callback) {
        Call<Artist> call = AAApleMusicApiAdapter.getApiService().getArtist(token, storefront, id);
        call.enqueue(callback);
    }

    public void getArtist(String storefront, String id, String language, Callback<Artist> callback) {
        Call<Artist> call = AAApleMusicApiAdapter.getApiService().getArtist(token, storefront, id, language);
        call.enqueue(callback);
    }

    public void getMultipleArtist(String storefront, List<String> ids, Callback<Artists> callback) {
        String formatIds = "";
        for (String id : ids) {
            formatIds = formatIds + id + ",";
        }
        formatIds = formatIds.substring(0, formatIds.lastIndexOf(","));
        Call<Artists> call = AAApleMusicApiAdapter.getApiService().getMultipleArtist(token, storefront, formatIds);
        call.enqueue(callback);
    }

    public void getMultipleArtist(String storefront, List<String> ids, String language, Callback<Artists> callback) {
        String formatIds = "";
        for (String id : ids) {
            formatIds = formatIds + id + ",";
        }
        formatIds = formatIds.substring(0, formatIds.lastIndexOf(","));
        Call<Artists> call = AAApleMusicApiAdapter.getApiService().getMultipleArtist(token, storefront, formatIds, language);
        call.enqueue(callback);
    }

    public void getCharts(String storefront, List<String> types, String language,
                          Integer genre, String chart, Integer limit, String offset, Callback<Charts> callback) {
        String formatTypes = "";
        for (String type : types) {
            formatTypes = formatTypes + type + ",";
        }
        formatTypes = formatTypes.substring(0, formatTypes.length()-1);
        Call<Charts> call = AAApleMusicApiAdapter.getApiService().getCharts(token, storefront, formatTypes,
                language, genre, chart, limit, offset);
        call.enqueue(callback);
    }

    public void getCurator(String storefront, String id, Callback<Curator> callback) {
        Call<Curator> call = AAApleMusicApiAdapter.getApiService().getCurator(token, storefront, id);
        call.enqueue(callback);
    }

    public void getCurator(String storefront, String id, String language, Callback<Curator> callback) {
        Call<Curator> call = AAApleMusicApiAdapter.getApiService().getCurator(token, storefront, id, language);
        call.enqueue(callback);
    }

    public void getMultipleCurator(String storefront, List<String> ids, Callback<Curators> callback) {
        String formatIds = "";
        for (String id : ids) {
            formatIds = formatIds + id + ",";
        }
        formatIds = formatIds.substring(0, formatIds.lastIndexOf(","));
        Call<Curators> call = AAApleMusicApiAdapter.getApiService().getMultipleCurator(token, storefront, formatIds);
        call.enqueue(callback);
    }

    public void getMultipleCurator(String storefront, List<String> ids, String language, Callback<Curators> callback) {
        String formatIds = "";
        for (String id : ids) {
            formatIds = formatIds + id + ",";
        }
        formatIds = formatIds.substring(0, formatIds.lastIndexOf(","));
        Call<Curators> call = AAApleMusicApiAdapter.getApiService().getMultipleCurator(token, storefront, formatIds, language);
        call.enqueue(callback);
    }

    public void getTopChartsGenres(String storefront, String language, Integer limit, String offset, Callback<Genres> callback) {
        Call<Genres> call = AAApleMusicApiAdapter.getApiService().getTopChartsGenres(token, storefront, language, limit, offset);
        call.enqueue(callback);
    }

    public void getGenre(String storefront, String id, String language, Callback<Genre> callback) {
        Call<Genre> call = AAApleMusicApiAdapter.getApiService().getGenre(token, storefront, id, language);
        call.enqueue(callback);
    }

    public void getMultipleGenre(String storefront, List<String> ids, String language, Callback<Genres> callback) {
        String formatIds = "";
        for (String id : ids) {
            formatIds = formatIds + id + ",";
        }
        formatIds = formatIds.substring(0, formatIds.lastIndexOf(","));
        Call<Genres> call = AAApleMusicApiAdapter.getApiService().getMultipleGenre(token, storefront, formatIds, language);
        call.enqueue(callback);
    }

    public void getMusicVideo(String storefront, String id, Callback<MusicVideo> callback) {
        Call<MusicVideo> call = AAApleMusicApiAdapter.getApiService().getMusicVideo(token, storefront, id);
        call.enqueue(callback);
    }

    public void getMusicVideo(String storefront, String id, String language, Callback<MusicVideo> callback) {
        Call<MusicVideo> call = AAApleMusicApiAdapter.getApiService().getMusicVideo(token, storefront, id, language);
        call.enqueue(callback);
    }

    public void getMultipleMusicVideo(String storefront, List<String> ids, Callback<MusicVideos> callback) {
        String formatIds = "";
        for (String id : ids) {
            formatIds = formatIds + id + ",";
        }
        formatIds = formatIds.substring(0, formatIds.lastIndexOf(","));
        Call<MusicVideos> call = AAApleMusicApiAdapter.getApiService().getMultipleMusicVideo(token, storefront, formatIds);
        call.enqueue(callback);
    }

    public void getMultipleMusicVideo(String storefront, List<String> ids, String language, Callback<MusicVideos> callback) {
        String formatIds = "";
        for (String id : ids) {
            formatIds = formatIds + id + ",";
        }
        formatIds = formatIds.substring(0, formatIds.lastIndexOf(","));
        Call<MusicVideos> call = AAApleMusicApiAdapter.getApiService().getMultipleMusicVideo(token, storefront, formatIds, language);
        call.enqueue(callback);
    }

    public void getPlayList(String storefront, String id, Callback<PlayList> callback) {
        Call<PlayList> call = AAApleMusicApiAdapter.getApiService().getPlayList(token, storefront, id);
        call.enqueue(callback);
    }

    public void getPlayList(String storefront, String id, String language, Callback<PlayList> callback) {
        Call<PlayList> call = AAApleMusicApiAdapter.getApiService().getPlayList(token, storefront, id, language);
        call.enqueue(callback);
    }

    public void getMultiplePlayList(String storefront, List<String> ids, Callback<PlayLists> callback) {
        String formatIds = "";
        for (String id : ids) {
            formatIds = formatIds + id + ",";
        }
        formatIds = formatIds.substring(0, formatIds.lastIndexOf(","));
        Call<PlayLists> call = AAApleMusicApiAdapter.getApiService().getMultiplePlayList(token, storefront, formatIds);
        call.enqueue(callback);
    }

    public void getMultiplePlayList(String storefront, List<String> ids, String language, Callback<PlayLists> callback) {
        String formatIds = "";
        for (String id : ids) {
            formatIds = formatIds + id + ",";
        }
        formatIds = formatIds.substring(0, formatIds.lastIndexOf(","));
        Call<PlayLists> call = AAApleMusicApiAdapter.getApiService().getMultiplePlayList(token, storefront, formatIds, language);
        call.enqueue(callback);
    }

    public void search(String storefront, String term, String language, Integer limit,
                       String offset, List<String> types, Callback<Searches> callback) {
        String formatTerm = "";
        if (term != null) {
            formatTerm = term.replace(" ", "+").toLowerCase();
        } else {
            formatTerm = null;
        }
        String formatTypes = "";
        if (types != null) {

            for (String id : types) {
                formatTypes = formatTypes + id + ",";
            }
            formatTypes = formatTypes.substring(0, formatTypes.lastIndexOf(","));
        } else {
            formatTypes = null;
        }

        Call<Searches> call = AAApleMusicApiAdapter.getApiService().search(token, storefront, formatTerm,
                language, limit, offset, formatTypes);
        call.enqueue(callback);
    }

    public void searchHint(String storefront, String term, String language, Integer limit, String offset,
                           List<String> types, Callback<Hint> callback) {
        String formatTerm = "";
        if (term != null) {
            formatTerm = term.replace(" ", "+").toLowerCase();
        } else {
            formatTerm = null;
        }
        String formatTypes = "";
        if (types != null) {

            for (String id : types) {
                formatTypes = formatTypes + id + ",";
            }
            formatTypes = formatTypes.substring(0, formatTypes.lastIndexOf(","));
        } else {
            formatTypes = null;
        }
        Call<Hint> call = AAApleMusicApiAdapter.getApiService().searchHint(token, storefront, formatTerm,
                language, limit, offset, formatTypes);
        call.enqueue(callback);
    }

    public void getSong(String storefront, String id, Callback<Song> callback) {
        Call<Song> call = AAApleMusicApiAdapter.getApiService().getSong(token, storefront, id);
        call.enqueue(callback);
    }

    public void getSong(String storefront, String id, String language, Callback<Song> callback) {
        Call<Song> call = AAApleMusicApiAdapter.getApiService().getSong(token, storefront, id, language);
        call.enqueue(callback);
    }

    public void getMultipleSong(String storefront, List<String> ids, Callback<Songs> callback) {
        String formatIds = "";
        for (String id : ids) {
            formatIds = formatIds + id + ",";
        }
        formatIds = formatIds.substring(0, formatIds.lastIndexOf(","));
        Call<Songs> call = AAApleMusicApiAdapter.getApiService().getMultipleSong(token, storefront, formatIds);
        call.enqueue(callback);
    }

    public void getMultipleSong(String storefront, List<String> ids, String language, Callback<Songs> callback) {
        String formatIds = "";
        for (String id : ids) {
            formatIds = formatIds + id + ",";
        }
        formatIds = formatIds.substring(0, formatIds.lastIndexOf(","));
        Call<Songs> call = AAApleMusicApiAdapter.getApiService().getMultipleSong(token, storefront, formatIds, language);
        call.enqueue(callback);
    }

    public void getStation(String storefront, String id, Callback<Station> callback) {
        Call<Station> call = AAApleMusicApiAdapter.getApiService().getStation(token, storefront, id);
        call.enqueue(callback);
    }

    public void getStation(String storefront, String id, String language, Callback<Station> callback) {
        Call<Station> call = AAApleMusicApiAdapter.getApiService().getStation(token, storefront, id, language);
        call.enqueue(callback);
    }

    public void getMultipleStation(String storefront, List<String> ids, Callback<Stations> callback) {
        String formatIds = "";
        for (String id : ids) {
            formatIds = formatIds + id + ",";
        }
        formatIds = formatIds.substring(0, formatIds.lastIndexOf(","));
        Call<Stations> call = AAApleMusicApiAdapter.getApiService().getMultipleStation(token, storefront, formatIds);
        call.enqueue(callback);
    }

    public void getMultipleStation(String storefront, List<String> ids, String language, Callback<Stations> callback) {
        String formatIds = "";
        for (String id : ids) {
            formatIds = formatIds + id + ",";
        }
        formatIds = formatIds.substring(0, formatIds.lastIndexOf(","));
        Call<Stations> call = AAApleMusicApiAdapter.getApiService().getMultipleStation(token, storefront, formatIds, language);
        call.enqueue(callback);
    }

    public void getStoreFront(String id, Callback<StoreFront> callback) {
        Call<StoreFront> call = AAApleMusicApiAdapter.getApiService().getStoreFront(token, id);
        call.enqueue(callback);
    }

    public void getStoreFront(String id, String language, Callback<StoreFront> callback) {
        Call<StoreFront> call = AAApleMusicApiAdapter.getApiService().getStoreFront(token, id, language);
        call.enqueue(callback);
    }

    public void getMultipleStoreFront(List<String> ids, Callback<StoreFronts> callback) {
        String formatIds = "";
        for (String id : ids) {
            formatIds = formatIds + id + ",";
        }
        formatIds = formatIds.substring(0, formatIds.lastIndexOf(","));
        Call<StoreFronts> call = AAApleMusicApiAdapter.getApiService().getMultipleStoreFront(token, formatIds);
        call.enqueue(callback);
    }

    public void getMultipleStoreFront(List<String> ids, String language, Callback<StoreFronts> callback) {
        String formatIds = "";
        for (String id : ids) {
            formatIds = formatIds + id + ",";
        }
        formatIds = formatIds.substring(0, formatIds.lastIndexOf(","));
        Call<StoreFronts> call = AAApleMusicApiAdapter.getApiService().getMultipleStoreFront(token, formatIds, language);
        call.enqueue(callback);
    }

    public void getAllStoreFronts(Callback<StoreFronts> callback) {
        Call<StoreFronts> call = AAApleMusicApiAdapter.getApiService().getAllStoreFronts(token);
        call.enqueue(callback);
    }

    public void getAllStoreFronts(String language, Callback<StoreFronts> callback) {
        Call<StoreFronts> call = AAApleMusicApiAdapter.getApiService().getAllStoreFronts(token, language);
        call.enqueue(callback);
    }

}
