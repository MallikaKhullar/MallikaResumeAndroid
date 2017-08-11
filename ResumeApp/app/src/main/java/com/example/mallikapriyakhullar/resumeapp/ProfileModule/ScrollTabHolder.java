package com.example.mallikapriyakhullar.resumeapp.ProfileModule;

/**
 * Created by mallikapriyakhullar on 12/08/17.
 */

import android.widget.AbsListView;

public interface ScrollTabHolder {

    void adjustScroll(int scrollHeight);

    void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount, int pagePosition);
}