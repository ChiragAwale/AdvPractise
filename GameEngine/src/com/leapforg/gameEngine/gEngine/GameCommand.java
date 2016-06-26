/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.gameEngine.gEngine;

import com.leapforg.gameEngine.entity.Player;

/**
 *
 * @author chira
 */
public abstract class GameCommand {
    public abstract void execute(Player player, String[] tokens);
    
}
