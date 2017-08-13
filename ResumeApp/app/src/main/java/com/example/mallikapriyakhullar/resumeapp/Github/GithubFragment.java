package com.example.mallikapriyakhullar.resumeapp.Github;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mallikapriyakhullar.resumeapp.Model.GithubProject;
import com.example.mallikapriyakhullar.resumeapp.R;
import com.github.florent37.materialviewpager.header.MaterialViewPagerHeaderDecorator;


import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by mallikapriyakhullar on 12/08/17.
 */
public class GithubFragment extends Fragment {

    private static final int ITEM_COUNT = 20;

    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;

    public static GithubFragment newInstance() {
        return new GithubFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_recyclerview, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        //TODO: get list of projects from github API here
        final List<GithubProject> projects = new ArrayList<>();
        for (int i = 0; i < ITEM_COUNT; ++i) projects.add(new GithubProject());

        //set layout manager for linear layout type
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //TODO: what does this do?
        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.addItemDecoration(new MaterialViewPagerHeaderDecorator());

        //set the adapter
        mRecyclerView.setAdapter(new GithubProjectAdapter(projects));
    }
}