package com.example.mallikapriyakhullar.resumeapp.Github;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mallikapriyakhullar.resumeapp.BaseView;
import com.example.mallikapriyakhullar.resumeapp.R;

public class GithubActivity extends AppCompatActivity implements BaseView<GithubPresenter> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);
    }

    @Override
    public void setPresenter(GithubPresenter presenter) {

    }
}
