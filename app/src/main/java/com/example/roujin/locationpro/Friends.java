package com.example.roujin.locationpro;

/**
 * Created by roujin on 2016/10/20.
 */
public class Friends {
    private String name;

    private int imageID;

    private int buttonID;

    public Friends(String name,int imageID,int buttonID){
        this.name = name;
        this.imageID = imageID;
        this.buttonID = buttonID;
    }

    public String getName(){
        return name;
    }

    public int getImageID(){
        return imageID;
    }

    public int getButtonID(){
        return buttonID;
    }
}
