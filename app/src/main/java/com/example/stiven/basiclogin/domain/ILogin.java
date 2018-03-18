package com.example.stiven.basiclogin.domain;

/**
 * Created by stiven on 18/03/2018.
 */

public interface ILogin {
    boolean validarUsuario(String user, String password);
    String login(String user, String password);
}
