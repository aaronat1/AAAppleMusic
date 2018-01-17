package com.aaronat1.aaapplemusic.io.entities.song;

import com.aaronat1.aaapplemusic.io.entities.Attributes;
import com.aaronat1.aaapplemusic.io.entities.Relationships;

import lombok.Data;

/**
 * Created by aaronasencio on 9/1/18.
 */

@Data
public class SongData {

    private Attributes attributes;

    private String href;

    private String id;

    private Relationships relationships;

    private String type;

}
