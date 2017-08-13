package com.example.mallikapriyakhullar.resumeapp.Github;

import com.example.mallikapriyakhullar.resumeapp.Model.GithubProject;

/**
 * Created by mallikapriyakhullar on 12/08/17.
 */

public class GithubContract {
    interface View {
        void openCommitPage(GithubProject project);
    }

    interface Presenter {
        void projectClicked(GithubProject project);

    }
}


