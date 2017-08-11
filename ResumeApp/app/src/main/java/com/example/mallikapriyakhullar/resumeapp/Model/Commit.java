package com.example.mallikapriyakhullar.resumeapp.Model;

/**
 * Created by mallikapriyakhullar on 12/08/17.
 */

public class Commit {
    Committer committer;
    String message;
    String url;

    public Committer getCommitter() {
        return committer;
    }

    public String getMessage() {
        return message;
    }

    public String getUrl() {
        return url;
    }

    public Commit(Committer committer, String message, String url) {
        this.committer = committer;
        this.message = message;
        this.url = url;
    }

    public Commit() {

    }
}
