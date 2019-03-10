package com.splashcoin.spl.Utils;

import com.splashcoin.spl.Block;
import com.splashcoin.spl.BlockChain;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import static com.splashcoin.spl.splashfiles.SplashFile.exportBlockChain;

public class addBlock {
    public static void addBlock(String message, String sender, String receiver) {
        Integer id = getCurrentId.getCurrentId();
//        System.out.println(id);
        id = id+1;
        Block newBlock = new Block();
        newBlock.id = id;
        newBlock.message = message;
        newBlock.sender = sender;
        newBlock.receiver = receiver;
        newBlock.previousHash = Hash.getPreviousHash();
        try {
            newBlock.hash = Hash.checksum(newBlock);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        BlockChain.BlockChain.add(newBlock);
        //export blockchain to blocks.splash
        exportBlockChain();
    }
}
