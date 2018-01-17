package com.aaronat1.aaapplemusic.io.entities.album;

import com.aaronat1.aaapplemusic.io.entities.Attributes;
import com.aaronat1.aaapplemusic.io.entities.Relationships;

import lombok.Data;

/**
 * Created by aaronasencio on 9/1/18.
 */

@Data
public class AlbumData {

    private Attributes attributes;

    private String href;

    private String id;

    private Relationships relationships;

    private String type;

}
