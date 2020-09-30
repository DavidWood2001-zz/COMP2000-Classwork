package com;

public class Main {

    public static void main(String[] args) {
        /* DATA */
        String message = "Having fun in the sun!";

        /* INSTRUCTIONS */
        System.out.println(" **Post to Social Media App");

        /* DATA */
        String photo = "Picture of me on the beach";

        /* INSTRUCTIONS */
        if (message.equals("")) {
            System.out.println("Please enter a message");
        } else {
            System.out.println("Message: " + message);
        }

        /* INSTRUCTIONS */
        if (!photo.equals("")) {
            System.out.println("Photo: " + photo);
        }

        /* DATA */
        String tags = "#sun,#beach,#seaside";

        /* INSTRUCTIONS */
        if (!tags.equals("")) {
            System.out.println("Tags: " + tags);
        }

        /* INSTRUCTIONS */
        System.out.println("Posting to Social Media");
    }
}
