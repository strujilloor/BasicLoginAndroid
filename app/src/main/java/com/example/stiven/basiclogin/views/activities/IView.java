package com.example.stiven.basiclogin.views.activities;

/**
 * Created by stiven on 18/03/2018.
 */

public interface IView {
    void showLoading();
    void hideLoading();
    void showErrors(String msg);
    void showResult(String result);
}
