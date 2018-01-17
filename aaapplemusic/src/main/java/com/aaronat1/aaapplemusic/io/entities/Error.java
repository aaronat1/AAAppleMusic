package com.aaronat1.aaapplemusic.io.entities;

import lombok.Data;

/**
 * Created by aaronasencio on 15/1/18.
 */

@Data
public class Error {

    private String id;

    private String title;

    private String detail;

    private String status;

    private String code;

}
