package com.example.stiven.basiclogin.views.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.stiven.basiclogin.R;
import com.example.stiven.basiclogin.views.presenters.IPresenter;
import com.example.stiven.basiclogin.views.presenters.Presenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity implements IView {
    @BindView(R.id.etUser)
    EditText etUser;

    @BindView(R.id.etPassword)
    EditText etPassword;

    @BindView(R.id.btnLogin)
    Button btnLogin;

    private IPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        presenter = new Presenter(this);
    }

    @Override
    public void showLoading() {
        Log.i("MainActivity", "Showing loading...");
    }

    @Override
    public void hideLoading() {
        Log.i("MainActivity", "hiding loading...");
    }

    @Override
    public void showErrors(String msg) {
        Log.i("MainActivity", msg);
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showResult(String result) {
        Log.i("MainActivity", result);
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btnLogin)
    public void onClickLogin() {
        String user = etUser.getText().toString();
        String password = etPassword.getText().toString();

        presenter.login(user, password);
    }
}
