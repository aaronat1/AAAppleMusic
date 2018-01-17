package com.aaronat1.aaapplemusic.io.entities;

import org.json.JSONException;
import org.json.JSONObject;

import lombok.Data;

/**
 * Created by aaronasencio on 10/1/18.
 */

@Data
public class QueryToken {

    private String kid;

    private String tid;

    public String toJSON(){
        JSONObject jsonObject= new JSONObject();
        try {
            jsonObject.put("kid", getKid());
            jsonObject.put("tid", getTid());
            return jsonObject.toString();
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "";
        }

    }
}
