package com.splashcoin.spl.Tests;

import java.util.Scanner;

import static com.splashcoin.spl.Utils.addBlock.addBlock;
import static com.splashcoin.spl.splashfiles.SplashFile.exportBlockChain;

public class addBlockData {
    public static void getBlockData() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter message");

        String message = myObj.nextLine();  // Read user input
        System.out.println("Message is: " + message);  // Output user input

        System.out.println("Enter sender");

        String sender = myObj.nextLine();  // Read user input
        System.out.println("Sender is: " + sender);  // Output user input

        System.out.println("Enter receiver");

        String receiver = myObj.nextLine();  // Read user input
        System.out.println("Receiver is: " + receiver);  // Output user input

        addBlock(message, sender, receiver);
    }

    public static void main(String[] args){
        getBlockData();
        exportBlockChain();
    }
}
