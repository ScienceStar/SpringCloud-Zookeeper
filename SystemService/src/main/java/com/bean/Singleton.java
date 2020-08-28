package com.bean;

/**
 * @ClassName Singleton
 * @Description: TODO
 * @Author lxc
 * @Date 2020/8/26 13:12
 * @Version V1.0
 **/
public class Singleton {

    private String userName;
    private Integer userAge;

    private static Singleton singleton = null;

    public Singleton(){

    }

    public static synchronized Singleton getInstance(){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
}
