package com.group1.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fatih on 27/11/2014.
 *
 */
public abstract class Character {
    /**
     * Characters name
     */
    String name;
    /**
     * Character's current Location
     */
    Location current;
    /**
     * Characters Item List, inventory
     */
    List<Item> inventory;

    /**
     * Constructor for Character, Designed to work both when initialization and loading the game
     * @param name String name to assign to character
     * @param inventory List of Items Character has
     * @param x Location of the Character
     * @param y Location of the Character
     */
    public  Character( String name, List<Item> inventory, int x, int y){
        this.name = name;

        if(inventory ==null)    this.inventory = new ArrayList<Item>();
        else    this.inventory = inventory;

        this.current = current;
    }


    /**
     * Player attacks given target with the given item if it is possible,
     * result given with an appropriate string message
     * Damage will be calculated according to users stats, and equipment
     * This method designed to be called from Player object inside Game object inside Parser object
     * game.player.attack(character,item);
     *
     * @param  character to interact
     * @param item to attack with
     * @return resulting boolean or string message depending on the implementation
     */
    public String attack(Character character,Item item){ return "Message";}




}