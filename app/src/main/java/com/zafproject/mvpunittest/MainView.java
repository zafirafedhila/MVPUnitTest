package com.zafproject.mvpunittest;

import com.zafproject.mvpunittest.base.BaseView;

public interface MainView extends BaseView {
    void  Success(String result);
    void  Error();
}
