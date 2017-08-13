package com.example.mallikapriyakhullar.resumeapp.Github;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ThemedSpinnerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mallikapriyakhullar.resumeapp.Model.GithubProject;
import com.example.mallikapriyakhullar.resumeapp.R;

import java.util.List;

/**
 * Created by mallikapriyakhullar on 12/08/17.
 */


public class GithubProjectAdapter extends RecyclerView.Adapter<GithubProjectViewHolder>{
    private List<GithubProject> projects;
    public GithubProjectAdapter(List<GithubProject> projects) {
        this.projects = projects;
    }
    @Override
    public GithubProjectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_githubproject, parent, false);
        return new GithubProjectViewHolder(view);
    }
    @Override
    public void onBindViewHolder(GithubProjectViewHolder holder, int position) {
        GithubProject project = projects.get(position);
        holder.name.setText(project.getName());
        holder.description.setText(project.getDescription());
        holder.ownerName.setText(project.getOwnerName());
        //on click
    }
    @Override
    public int getItemCount() {
        return projects.size();
    }
}