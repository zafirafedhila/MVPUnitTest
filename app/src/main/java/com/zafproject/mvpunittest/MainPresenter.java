package com.zafproject.mvpunittest;

import android.widget.EditText;

import com.zafproject.mvpunittest.base.BasePresenter;

public class MainPresenter implements BasePresenter<MainView> {

    private MainView mainView;

    @Override
    public void onAttach(MainView view) {
        mainView = view;
    }

    public  void  calculate (EditText editTextA, EditText editTextB){
        String inputanA= editTextA.getText().toString().trim();
        String inputanB=editTextB.getText().toString().trim();

        if (inputanA.isEmpty()|| inputanB.isEmpty()){
            mainView.Error();
        }else {
            double a= Double.parseDouble(inputanA);
            double b= Double.parseDouble(inputanB);
            double c = a*b;
            mainView.Success(String.valueOf(c));
        }
    }

    @Override
    public void onDettach() {
        mainView = null;


    }
}
