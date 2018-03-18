package com.example.stiven.basiclogin.domain;

/**
 * Created by stiven on 18/03/2018.
 */

public class Login implements ILogin {
    @Override
    public boolean validarUsuario(String user, String password) {
        if (user.equals("juan") && password.equals("1234")){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String login(String user, String password) {
        if (validarUsuario(user, password)){
            return "User logged in";
        }else{
            return "Error with the User or Password";
        }
    }
}
