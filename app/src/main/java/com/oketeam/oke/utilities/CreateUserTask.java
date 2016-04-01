package com.oketeam.oke.utilities;

import android.os.AsyncTask;

import com.oketeam.oke.persistence.entity.User;

import org.springframework.web.client.RestTemplate;

import static com.oketeam.oke.utilities.Constants.REST_SERVICE_URI;

/**
 * Created by chris on 3/31/16.
 */
public class CreateUserTask extends AsyncTask<User, Void, Void> {

    @Override
    protected Void doInBackground(User... params) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForLocation(REST_SERVICE_URI + "/user/", params[0], User.class);
        return null;
    }
}

