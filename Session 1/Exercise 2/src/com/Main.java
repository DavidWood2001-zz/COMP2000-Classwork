package com;

public class Main {

    public static void main(String[] args) {
        /* DATA */
        String message = "Having fun in the sun!";
        String photo = "Picture of me on the beach";
        String tags = "#sun,#beach,#seaside";

        postToSocialMedia(message, photo, tags);
    }

    public static void postToSocialMedia(String message, String photo,String tags ){
        System.out.println(" **Post to Social Media App");
        checkMessage(message);
        checkPhoto(photo);
        checkTags(tags);
        System.out.println("Posting to Social Media");
    }

    public static void checkMessage(String msg){
        if (msg.equals("")) {
            System.out.println("Please enter a message");
        } else {
            System.out.println("Message: " + msg);
        }
    }

    public static void checkPhoto(String img){
        if (!img.equals("")) {
            System.out.println("Photo: " + img);
        }
    }

    public static void checkTags(String tags){
        if (!tags.equals("")) {
            System.out.println("Tags: " + tags);
        }
    }
}
