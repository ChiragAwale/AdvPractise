/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.gameEngine.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chira
 */
public class Player {
    private String userName;
    private int gold;
    private List<Bag> bag=new ArrayList<>();

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
 

    public Player(String userName,int gold) {
        this.userName = userName;
        this.gold = gold;
    }

    public Player() {
        
    }
    
 

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Bag> getBag() {
        return bag;
    }

    public void setBag(List<Bag> bag) {
        this.bag = bag;
    }
    
    
    
}
