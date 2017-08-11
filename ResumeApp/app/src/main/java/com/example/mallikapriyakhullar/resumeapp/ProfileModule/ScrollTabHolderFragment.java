package com.example.mallikapriyakhullar.resumeapp.ProfileModule;

/**
 * Created by mallikapriyakhullar on 12/08/17.
 */

import android.support.v4.app.Fragment;

public abstract class ScrollTabHolderFragment extends Fragment implements ScrollTabHolder {

    protected ScrollTabHolder mScrollTabHolder;

    public void setScrollTabHolder(ScrollTabHolder scrollTabHolder) {
        mScrollTabHolder = scrollTabHolder;
    }
}