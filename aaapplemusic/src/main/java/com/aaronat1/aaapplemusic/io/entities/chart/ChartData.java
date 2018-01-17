package com.aaronat1.aaapplemusic.io.entities.chart;

import com.aaronat1.aaapplemusic.io.entities.Attributes;
import com.aaronat1.aaapplemusic.io.entities.Relationships;

import lombok.Data;

/**
 * Created by aaronasencio on 9/1/18.
 */

@Data
public class ChartData {

    private String href;

    private String id;

    private String type;

    private Attributes attributes;

    private Relationships relationships;

}
