package com.aaronat1.aaapplemusic.io.entities.playlist;

import com.aaronat1.aaapplemusic.io.entities.Artwork;
import com.aaronat1.aaapplemusic.io.entities.PlayParams;
import com.aaronat1.aaapplemusic.io.entities.storefront.Description;

import lombok.Data;

/**
 * Created by aaronasencio on 9/1/18.
 */

@Data
public class AttributesPlayList {

    private Artwork artwork;

    private String curatorName;

    private Description description;

    private String lastModifiedDate;

    private String name;

    private PlayParams playParams;

    private String playlistType;

    private String url;


}
