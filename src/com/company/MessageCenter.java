package com.company;

public class MessageCenter {
    static boolean showMessage = true;

    public static void DebugMessage(String message) {
        if (showMessage) {System.out.println(message);}
    }
}
