/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.gameEngine;

import com.leapforg.gameEngine.entity.Player;
import com.leapforg.gameEngine.gEngine.GameCommand;
import com.leapforg.gameEngine.gEngine.GameFactory;
import com.leapforg.gameEngine.gEngine.MoveCommand;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author chira
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
        
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter user name ");
        String name = reader.readLine();
        Player player = new Player(name);
        while(true){
        System.out.println("Enter Command");
           String[] tokens = reader.readLine().split(" ");
           
            GameCommand gc = GameFactory.get(tokens[0]);
           
           
           
           if(gc!=null){
               System.out.println("ss");
               gc.execute(player, tokens);
           }
           else{
               System.out.println("The command you entered is " + tokens[0]);
               System.out.println(tokens[0] + " is an invalid command");
           }
           
        }
        
       }catch(IOException ioe){
           System.out.println(ioe.getMessage());
       }
    
    }
    
}
