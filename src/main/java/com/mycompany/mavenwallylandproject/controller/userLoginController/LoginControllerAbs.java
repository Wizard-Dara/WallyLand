/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenwallylandproject.controller.userLoginController;

import com.mycompany.mavenwallylandproject.model.userLoginModel.UserLoginModelInterface;

/**
 *
 * @author aniut
 */
public abstract class LoginControllerAbs {
    protected UserLoginModelInterface userModel;

    public LoginControllerAbs(UserLoginModelInterface userModel) {
        this.userModel = userModel;
    }
    
    protected boolean validateInput(String input){
        return input != null && !input.isEmpty();
    }
}
