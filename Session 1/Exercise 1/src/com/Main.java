package com;

public class Main {

    public static void main(String[] args) {
	    /* DATA */
        String userName = "bob";
        String password = "pass";

        /* INSTRUCTIONS */
        checkUserInfo(userName,password);
    }

    public static void checkUserInfo(String uName, String pWord){
        System.out.println("Checking password");
        if (pWord == "pass" && uName == "bob"){
            System.out.println("Logging in " + uName);
        }
        else {
            System.out.println("Incorrect password or user name");
        }
    }
}
