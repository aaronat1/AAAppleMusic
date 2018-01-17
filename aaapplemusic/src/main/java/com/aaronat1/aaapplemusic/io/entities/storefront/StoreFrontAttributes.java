package com.aaronat1.aaapplemusic.io.entities.storefront;

import java.util.List;

import lombok.Data;

/**
 * Created by aaronasencio on 9/1/18.
 */

@Data
public class StoreFrontAttributes {

    private String defaultLanguageTag;

    private String name;

    private List<String> supportedLanguageTags;

}