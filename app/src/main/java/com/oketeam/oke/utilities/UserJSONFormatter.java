package com.oketeam.oke.utilities;

import com.oketeam.oke.persistence.entity.User;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by jaca on 28/03/16.
 */
public class UserJSONFormatter {
    public static JSONObject formatUser(JSONObject jsonUser) {
        try {
            jsonUser.put("picture", jsonUser.optJSONObject("picture").optJSONObject("data").optString("url"));
            jsonUser.put("age_range", jsonUser.optJSONObject("age_range").optInt("min"));
            jsonUser.put("id_facebook", jsonUser.remove("id").toString());
        } catch (Exception e) {
        }
        return jsonUser;
    }

    public static User getUser(JSONObject jsonUser) {
        User user = new User();
        try {
            user.setId_facebook(jsonUser.getString("id_facebook"));
            user.setName(jsonUser.getString("name"));
            user.setFirst_name(jsonUser.getString("first_name"));
            user.setLast_name(jsonUser.getString("last_name"));
            user.setGender(jsonUser.getString("gender"));
            user.setLink(jsonUser.getString("link"));
            user.setPicture(jsonUser.getString("picture"));
            user.setLocale(jsonUser.getString("locale"));
            user.setVerified(jsonUser.getBoolean("verified"));
            user.setTimezone(Float.parseFloat(jsonUser.getString("timezone")));
            user.setAge_range(Short.parseShort(jsonUser.getString("age_range")));
            user.setBirthday(jsonUser.getString("birthday"));
            user.setVictories(jsonUser.getInt("victories"));
            user.setDefeats(jsonUser.getInt("defeats"));
        } catch (JSONException ex) {

        }
        return user;
    }
}
