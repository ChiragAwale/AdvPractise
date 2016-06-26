/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.gameEngine.gEngine;

import com.leapforg.gameEngine.entity.Player;

/**
 *
 * @author chirag
 */
public class MoveCommand extends GameCommand {

    @Override
    public void execute(Player player, String[] tokens) {
        if(tokens.length==2){
        if (tokens[1].equalsIgnoreCase("left") || tokens[1].equalsIgnoreCase("right") || tokens[1].equalsIgnoreCase("forward") || tokens[1].equalsIgnoreCase("back")) {
            System.out.println(player.getUserName() + " moved " + tokens[1]);
        }
        else{
            System.out.println("Invalid move command. Please Try Again");
        }

    }else{System.out.println("Error: Partial Command Entry. Please Try Again");
    }
}
}