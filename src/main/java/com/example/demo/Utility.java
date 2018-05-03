package com.example.demo;

public class Utility {


    public static String getConfirmationID(){
        int counter = 6;
        String ALPHA_NUMERIC_STRING = "123456789ABCDEFGHIJKLMNOPQR";
        StringBuilder builder = new StringBuilder();
        while (counter-- != 0) {
            int index = (int)(ALPHA_NUMERIC_STRING.length() * Math.random());
            builder.append(ALPHA_NUMERIC_STRING.charAt(index));
        }
        return builder.toString();

    }

}
