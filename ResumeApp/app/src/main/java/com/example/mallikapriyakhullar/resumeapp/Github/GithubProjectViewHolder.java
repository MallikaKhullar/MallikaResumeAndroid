package com.example.mallikapriyakhullar.resumeapp.Github;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mallikapriyakhullar.resumeapp.R;

/**
 * Created by mallikapriyakhullar on 12/08/17.
 */

public class GithubProjectViewHolder extends RecyclerView.ViewHolder{
    //TODO - butterknife
    public TextView name;
    public TextView ownerName;
    public TextView description;

    public GithubProjectViewHolder(View itemView, TextView name, TextView ownerName, TextView description) {
        super(itemView);
        this.name = name;
        this.ownerName = ownerName;
        this.description = description;
    }

    public GithubProjectViewHolder(View itemView) {
        super(itemView);
//        ownerName = (TextView)itemView.findViewById(R.id.owner_name);
//        name = (TextView)itemView.findViewById(R.id.name);
//        description = (TextView)itemView.findViewById(R.id.description);
    }
}