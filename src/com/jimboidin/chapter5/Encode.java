package com.jimboidin.chapter5;

//Use XOR to encode and decode a message
public class Encode {
    public static void main(String[] args){
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 89;

        System.out.println("Original message: " + msg);

        //encode the message
        for (int i = 0; i < msg.length(); i++)
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        System.out.println("Encoded message: " + encmsg);

        //decode the message
        for (int i = 0; i < msg.length(); i++)
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

        System.out.println("Decoded message: " + decmsg);
    }
}
