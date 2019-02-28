package com.zafproject.mvpunittest.base;

public interface BasePresenter <M extends BaseView>{
    void onAttach(M view);
        void onDettach();

}

// M parameter
