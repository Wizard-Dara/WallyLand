/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenwallylandproject.controller.userLoginController;

import com.mycompany.mavenwallylandproject.model.userLoginModel.UserLoginModelInterface;
import com.mycompany.mavenwallylandproject.view.userLoginView.LoginView;

/**
 *
 * @author aniut
 */
public class LoginController extends LoginControllerAbs{
    private LoginView loginView;
    
    public LoginController(UserLoginModelInterface userModel, LoginView loginView) {
        super(userModel);
        this.loginView = loginView;
    }
    
    public boolean login(){
        String username = loginView.getUsername();
        String password = loginView.getPassword();
        
        if(validateInput(username) && validateInput(password)){
            //
        }
        return false;
    }
    
}
