/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.gameEngine.gEngine;

/**
 *
 * @author chira
 */
public class GameFactory {

    public static GameCommand get(String cmd) {
        if (cmd.equalsIgnoreCase("move")) {
            return new MoveCommand();
        } else if (cmd.equalsIgnoreCase("drop")) {
            return new DropCommand();
        } else {
            return null;
        }

    }
}
