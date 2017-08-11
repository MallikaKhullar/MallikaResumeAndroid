package com.example.mallikapriyakhullar.resumeapp.Github;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mallikapriyakhullar.resumeapp.R;

/**
 * Created by mallikapriyakhullar on 12/08/17.
 */

public class GithubCommitViewHolder extends RecyclerView.ViewHolder{
    public TextView commitMessage;
    public TextView commiterName;

    public GithubCommitViewHolder(View itemView, TextView commitMessage, TextView commiterName, ImageView commiterImage) {
        super(itemView);
        this.commitMessage = commitMessage;
        this.commiterName = commiterName;
        this.commiterImage = commiterImage;
    }

    public ImageView commiterImage;

    public GithubCommitViewHolder(View itemView) {
        super(itemView);
//        commiterName = (TextView)itemView.findViewById(R.id.commiter_name);
//        commitMessage = (TextView)itemView.findViewById(R.id.commit_message);
//        commiterImage = (ImageView)itemView.findViewById(R.id.commiter_image);
    }
}