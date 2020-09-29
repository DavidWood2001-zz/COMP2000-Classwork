package com;

public class User {
    String userName;
    String password;

    public User(String inName, String inPass) {
        this.userName = inName;
        this.password = inPass;
    }

    public void checkUserInfo(){
        System.out.println("Checking password");
        if (this.password == "pass" && userName == "bob"){
            System.out.println("Logging in " + this.userName);
        }
        else {
            System.out.println("Incorrect password or user name");
        }
    }
}
