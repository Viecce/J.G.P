package com.p.g.j.lenovo.jgp;

/**
 * Created by lenovo on 2017/9/6.
 */

public class Fruit {
    private String name;
    private int imageId;
    public Fruit(String name, int imageId){
        this.name=name;
        this.imageId=imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return  imageId;
    }
}
