package com.bean;

/**
 * @ClassName Singleton
 * @Description: TODO
 * @Author lxc
 * @Date 2020/8/26 13:12
 * @Version V1.0
 **/
public class Singleton {

    private static Singleton singleton =null;

    public Singleton(){

    }

    public static synchronized Singleton getInstance(){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
