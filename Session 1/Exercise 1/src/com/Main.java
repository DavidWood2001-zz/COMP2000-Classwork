package com;

public class Main {

    public static void main(String[] args) {
	    /* DATA */
        String userName = "bob";
        String password = "pass";

        /* INSTRUCTIONS */
        System.out.println("Checking password");
        if (password == "pass" && userName == "bob"){
            System.out.println("Logging in " + userName);
        }
        else {
            System.out.println("Incorrect password or user name");
        }
    }
}
