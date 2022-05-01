/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dpCommand.action;

import model.Game;
import model.dpCommand.Command;
import viewConsole.View;

/**
 *
 * @author basile
 */
public class Help implements Command {
    private String[] error;
    private Game game;

    public Help(Game game, String[] error) {
        this.game = game;
        this.error = error;
    }

    @Override
    public void execute() {
        game.notifyHelp(error);
    }

    @Override
    public void unexecute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isReversible() {
        return false;
    }

    @Override
    public boolean isHelp() {
        return true;
    }
    
    public String[] getError(){
        return error;
    }

}
