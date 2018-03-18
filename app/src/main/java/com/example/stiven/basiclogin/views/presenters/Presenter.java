package com.example.stiven.basiclogin.views.presenters;

import com.example.stiven.basiclogin.domain.ILogin;
import com.example.stiven.basiclogin.domain.Login;
import com.example.stiven.basiclogin.views.activities.IView;

/**
 * Created by stiven on 18/03/2018.
 */

public class Presenter implements IPresenter {

    private IView view;
    private ILogin login;

    public Presenter(IView view) {
        this.view = view;
        this.login = new Login();
    }

    @Override
    public void login(String user, String password) {
        try {
            view.showLoading();
            String result = login.login(user, password);
            view.hideLoading();
            view.showResult(result);
        } catch (Exception e){
            view.showErrors(e.getMessage());
        }
    }
}
