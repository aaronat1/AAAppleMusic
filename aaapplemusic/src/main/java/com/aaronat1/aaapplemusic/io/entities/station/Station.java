package com.aaronat1.aaapplemusic.io.entities.station;

import com.aaronat1.aaapplemusic.io.entities.song.SongData;

import java.util.List;

import lombok.Data;

/**
 * Created by aaronasencio on 9/1/18.
 */

@Data
public class Station {

    private List<StationData> data;

    public StationData getStation() {
        if (data != null && data.size() > 0) {
            return data.get(0);
        } else {
            return null;
        }
    }
}
