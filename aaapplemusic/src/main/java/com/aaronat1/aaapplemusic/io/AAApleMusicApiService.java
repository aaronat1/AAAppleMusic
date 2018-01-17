package com.aaronat1.aaapplemusic.io;


import com.aaronat1.aaapplemusic.io.entities.activity.Activities;
import com.aaronat1.aaapplemusic.io.entities.activity.Activity;
import com.aaronat1.aaapplemusic.io.entities.album.Album;
import com.aaronat1.aaapplemusic.io.entities.album.Albums;
import com.aaronat1.aaapplemusic.io.entities.applecurators.AppleCurator;
import com.aaronat1.aaapplemusic.io.entities.applecurators.AppleCurators;
import com.aaronat1.aaapplemusic.io.entities.artist.Artist;
import com.aaronat1.aaapplemusic.io.entities.artist.Artists;
import com.aaronat1.aaapplemusic.io.entities.chart.Chart;
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

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by aasencio on 9/1/18.
 */

public interface AAApleMusicApiService {

    String CONTENT_TYPE = "application/json";


    @GET("/v1/storefronts/{id}")
    Call<StoreFront> getStoreFront(@Header("Authorization") String developerToken,
                                   @Path("id") String id);

    @GET("/v1/storefronts/{id}")
    Call<StoreFront> getStoreFront(@Header("Authorization") String developerToken,
                                   @Path("id") String id,
                                   @Query("l") String language);

    @GET("/v1/storefronts")
    Call<StoreFronts> getMultipleStoreFront(@Header("Authorization") String developerToken,
                                            @Query("ids") String ids);

    @GET("/v1/storefronts")
    Call<StoreFronts> getMultipleStoreFront(@Header("Authorization") String developerToken,
                                            @Query("ids") String ids,
                                            @Query("l") String language);

    @GET("/v1/storefronts")
    Call<StoreFronts> getAllStoreFronts(@Header("Authorization") String developerToken);

    @GET("/v1/storefronts")
    Call<StoreFronts> getAllStoreFronts(@Header("Authorization") String developerToken,
                                        @Query("l") String language);

    @GET("/v1/catalog/{storefront}/albums/{id}")
    Call<Album> getAlbum(@Header("Authorization") String developerToken,
                         @Path("storefront") String storefront,
                         @Path("id") String id);

    @GET("/v1/catalog/{storefront}/albums/{id}")
    Call<Album> getAlbum(@Header("Authorization") String developerToken,
                         @Path("storefront") String storefront,
                         @Path("id") String id,
                         @Query("l") String language);

    @GET("/v1/catalog/{storefront}/albums")
    Call<Albums> getMultipleAlbum(@Header("Authorization") String developerToken,
                         @Path("storefront") String storefront,
                         @Query("ids") String ids);

    @GET("/v1/catalog/{storefront}/albums")
    Call<Albums> getMultipleAlbum(@Header("Authorization") String developerToken,
                                  @Path("storefront") String storefront,
                                  @Query("ids") String ids,
                                  @Query("l") String language);

    @GET("/v1/catalog/{storefront}/songs/{id}")
    Call<Song> getSong(@Header("Authorization") String developerToken,
                       @Path("storefront") String storefront,
                       @Path("id") String id);

    @GET("/v1/catalog/{storefront}/songs/{id}")
    Call<Song> getSong(@Header("Authorization") String developerToken,
                       @Path("storefront") String storefront,
                       @Path("id") String id,
                       @Query("l") String language);

    @GET("/v1/catalog/{storefront}/songs")
    Call<Songs> getMultipleSong(@Header("Authorization") String developerToken,
                                @Path("storefront") String storefront,
                                @Query("ids") String ids);

    @GET("/v1/catalog/{storefront}/songs")
    Call<Songs> getMultipleSong(@Header("Authorization") String developerToken,
                                @Path("storefront") String storefront,
                                @Query("ids") String ids,
                                @Query("l") String language);

    @GET("/v1/catalog/{storefront}/artists/{id}")
    Call<Artist> getArtist(@Header("Authorization") String developerToken,
                           @Path("storefront") String storefront,
                           @Path("id") String id);

    @GET("/v1/catalog/{storefront}/artists/{id}")
    Call<Artist> getArtist(@Header("Authorization") String developerToken,
                           @Path("storefront") String storefront,
                           @Path("id") String id,
                           @Query("l") String language);

    @GET("/v1/catalog/{storefront}/artists")
    Call<Artists> getMultipleArtist(@Header("Authorization") String developerToken,
                                    @Path("storefront") String storefront,
                                    @Query("ids") String ids);

    @GET("/v1/catalog/{storefront}/artists")
    Call<Artists> getMultipleArtist(@Header("Authorization") String developerToken,
                                    @Path("storefront") String storefront,
                                    @Query("ids") String ids,
                                    @Query("l") String language);

    @GET("/v1/catalog/{storefront}/music-videos/{id}")
    Call<MusicVideo> getMusicVideo(@Header("Authorization") String developerToken,
                                   @Path("storefront") String storefront,
                                   @Path("id") String id);

    @GET("/v1/catalog/{storefront}/music-videos/{id}")
    Call<MusicVideo> getMusicVideo(@Header("Authorization") String developerToken,
                                   @Path("storefront") String storefront,
                                   @Path("id") String id,
                                   @Query("l") String language);

    @GET("/v1/catalog/{storefront}/music-videos")
    Call<MusicVideos> getMultipleMusicVideo(@Header("Authorization") String developerToken,
                                            @Path("storefront") String storefront,
                                            @Query("ids") String ids);

    @GET("/v1/catalog/{storefront}/music-videos")
    Call<MusicVideos> getMultipleMusicVideo(@Header("Authorization") String developerToken,
                                            @Path("storefront") String storefront,
                                            @Query("ids") String ids,
                                            @Query("l") String language);

    @GET("/v1/catalog/{storefront}/playlists/{id}")
    Call<PlayList> getPlayList(@Header("Authorization") String developerToken,
                               @Path("storefront") String storefront,
                               @Path("id") String id);

    @GET("/v1/catalog/{storefront}/playlists/{id}")
    Call<PlayList> getPlayList(@Header("Authorization") String developerToken,
                               @Path("storefront") String storefront,
                               @Path("id") String id,
                               @Query("l") String language);

    @GET("/v1/catalog/{storefront}/playlists")
    Call<PlayLists> getMultiplePlayList(@Header("Authorization") String developerToken,
                                        @Path("storefront") String storefront,
                                        @Query("ids") String ids);

    @GET("/v1/catalog/{storefront}/playlists")
    Call<PlayLists> getMultiplePlayList(@Header("Authorization") String developerToken,
                                        @Path("storefront") String storefront,
                                        @Query("ids") String ids,
                                        @Query("l") String language);

    @GET("/v1/catalog/{storefront}/stations/{id}")
    Call<Station> getStation(@Header("Authorization") String developerToken,
                             @Path("storefront") String storefront,
                             @Path("id") String id);

    @GET("/v1/catalog/{storefront}/stations/{id}")
    Call<Station> getStation(@Header("Authorization") String developerToken,
                             @Path("storefront") String storefront,
                             @Path("id") String id,
                             @Query("l") String language);

    @GET("/v1/catalog/{storefront}/stations")
    Call<Stations> getMultipleStation(@Header("Authorization") String developerToken,
                                      @Path("storefront") String storefront,
                                      @Query("ids") String ids);

    @GET("/v1/catalog/{storefront}/stations")
    Call<Stations> getMultipleStation(@Header("Authorization") String developerToken,
                                      @Path("storefront") String storefront,
                                      @Query("ids") String ids,
                                      @Query("l") String language);

    @GET("/v1/catalog/{storefront}/curators/{id}")
    Call<Curator> getCurator(@Header("Authorization") String developerToken,
                             @Path("storefront") String storefront,
                             @Path("id") String id);

    @GET("/v1/catalog/{storefront}/curators/{id}")
    Call<Curator> getCurator(@Header("Authorization") String developerToken,
                             @Path("storefront") String storefront,
                             @Path("id") String id,
                             @Query("l") String language);

    @GET("/v1/catalog/{storefront}/curators")
    Call<Curators> getMultipleCurator(@Header("Authorization") String developerToken,
                                      @Path("storefront") String storefront,
                                      @Query("ids") String ids);

    @GET("/v1/catalog/{storefront}/curators")
    Call<Curators> getMultipleCurator(@Header("Authorization") String developerToken,
                                      @Path("storefront") String storefront,
                                      @Query("ids") String ids,
                                      @Query("l") String language);

    @GET("/v1/catalog/{storefront}/activities/{id}")
    Call<Activity> getActivity(@Header("Authorization") String developerToken,
                              @Path("storefront") String storefront,
                              @Path("id") String id);

    @GET("/v1/catalog/{storefront}/activities/{id}")
    Call<Activity> getActivity(@Header("Authorization") String developerToken,
                               @Path("storefront") String storefront,
                               @Path("id") String id,
                               @Query("l") String language);

    @GET("/v1/catalog/{storefront}/activities")
    Call<Activities> getMultipleActivity(@Header("Authorization") String developerToken,
                                         @Path("storefront") String storefront,
                                         @Query("ids") String ids);

    @GET("/v1/catalog/{storefront}/activities")
    Call<Activities> getMultipleActivity(@Header("Authorization") String developerToken,
                                         @Path("storefront") String storefront,
                                         @Query("ids") String ids,
                                         @Query("l") String language);

    @GET("/v1/catalog/{storefront}/apple-curators/{id}")
    Call<AppleCurator> getAppleCurator(@Header("Authorization") String developerToken,
                                       @Path("storefront") String storefront,
                                       @Path("id") String id);

    @GET("/v1/catalog/{storefront}/apple-curators/{id}")
    Call<AppleCurator> getAppleCurator(@Header("Authorization") String developerToken,
                                       @Path("storefront") String storefront,
                                       @Path("id") String id,
                                       @Query("l") String language);

    @GET("/v1/catalog/{storefront}/apple-curators")
    Call<AppleCurators> getMultipleAppleCurator(@Header("Authorization") String developerToken,
                                            @Path("storefront") String storefront,
                                            @Query("ids") String ids);

    @GET("/v1/catalog/{storefront}/apple-curators")
    Call<AppleCurators> getMultipleAppleCurator(@Header("Authorization") String developerToken,
                                                @Path("storefront") String storefront,
                                                @Query("ids") String ids,
                                                @Query("l") String language);

    @GET("/v1/catalog/{storefront}/charts")
    Call<Charts> getCharts(@Header("Authorization") String developerToken,
                           @Path("storefront") String storefront,
                           @Query("types") String types,
                           @Query("l") String language,
                           @Query("genre") int genre,
                           @Query("chart") String chart,
                           @Query("limit") Integer limit,
                           @Query("offset") String offset);

    @GET("/v1/catalog/{storefront}/genres")
    Call<Genres> getTopChartsGenres(@Header("Authorization") String developerToken,
                                    @Path("storefront") String storefront,
                                    @Query("l") String language,
                                    @Query("limit") Integer limit,
                                    @Query("offset") String offset);

    @GET("/v1/catalog/{storefront}/genres/{id}")
    Call<Genre> getGenre(@Header("Authorization") String developerToken,
                         @Path("storefront") String storefront,
                         @Path("id") String id,
                         @Query("l") String language);

    @GET("/v1/catalog/{storefront}/genres")
    Call<Genres> getMultipleGenre(@Header("Authorization") String developerToken,
                                    @Path("storefront") String storefront,
                                    @Query("ids") String ids,
                                    @Query("l") String language);

    @GET("/v1/catalog/{storefront}/search")
    Call<Searches> search(@Header("Authorization") String developerToken,
                          @Path("storefront") String storefront,
                          @Query("term") String term,
                          @Query("l") String language,
                          @Query("limit") Integer limit,
                          @Query("offset") String offset,
                          @Query("types") String types);

    @GET("/v1/catalog/{storefront}/search/hints")
    Call<Hint> searchHint(@Header("Authorization") String developerToken,
                          @Path("storefront") String storefront,
                          @Query("term") String term,
                          @Query("l") String language,
                          @Query("limit") Integer limit,
                          @Query("offset") String offset,
                          @Query("types") String types);


}
