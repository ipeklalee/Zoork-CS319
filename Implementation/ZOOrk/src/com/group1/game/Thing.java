package com.group1.game;

/**
 * Created by Fatih on 27/11/2014.
 */
public interface Thing {


    /**
     * This methods returns the message to be send when interacted with the object itself
     * @return String message to be displayed
     */

    public String getMessage();
    public String getName();
    public String interact();
}

