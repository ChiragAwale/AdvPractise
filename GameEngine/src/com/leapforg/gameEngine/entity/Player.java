/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.gameEngine.entity;

/**
 *
 * @author chira
 */
public class Player {
    private String userName;

    public Player(String userName) {
        this.userName = userName;
    }

    public Player() {
        
    }
    
 

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
}
