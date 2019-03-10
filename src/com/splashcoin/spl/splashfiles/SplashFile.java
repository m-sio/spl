package com.splashcoin.spl.splashfiles;

import com.splashcoin.spl.Block;
import com.splashcoin.spl.BlockChain;

import java.io.*;
import java.util.ArrayList;

public class SplashFile {

    /*
        Export BlockChain to blocks.splash
     */
    public static void exportBlockChain() {
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("../splashfiles/blocks.splash");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(BlockChain.BlockChain);
            out.close();
            fileOut.close();
//            System.out.printf("Serialized data is saved in /splashfiles/blocks.splash\n");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }



    /*
        Import BlockChain from blocks.splash
     */
    public static ArrayList<Block> importBlockChain() {
        ArrayList<Block> BlockChain = new ArrayList<Block>();
        try {
            FileInputStream fis = new FileInputStream("../splashfiles/blocks.splash");
            ObjectInputStream ois = new ObjectInputStream(fis);

            BlockChain = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
            return BlockChain;
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
        }
        return BlockChain;
    }
}