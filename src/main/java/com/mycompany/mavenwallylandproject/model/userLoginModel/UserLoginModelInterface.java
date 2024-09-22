/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mavenwallylandproject.model.userLoginModel;

/**
 *
 * @author aniut
 */
public interface UserLoginModelInterface {
    boolean authenticate(String username, String password);
    
    void createUser(String username, String password, String email);
 
}
