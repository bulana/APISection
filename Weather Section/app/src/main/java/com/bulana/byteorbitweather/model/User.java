package com.bulana.byteorbitweather.model;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import com.bulana.byteorbitweather.model.AutoValue_User;

@AutoValue
public abstract class User {

    public abstract long id();

    public abstract String login();

    public static JsonAdapter<User> jsonAdapter(Moshi moshi) {
        return new AutoValue_User.MoshiJsonAdapter(moshi);
    }
}
