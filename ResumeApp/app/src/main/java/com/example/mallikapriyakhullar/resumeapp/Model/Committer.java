package com.example.mallikapriyakhullar.resumeapp.Model;

/**
 * Created by mallikapriyakhullar on 12/08/17.
 */

public class Committer {

    String login;
    String imageUrl;
    String profileUrl;

    public Committer() {}

    public Committer(String login, String imageUrl, String profileUrl) {
        this.login = login;
        this.imageUrl = imageUrl;
        this.profileUrl = profileUrl;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }
}
