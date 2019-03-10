package com.splashcoin.spl.Utils;

import com.splashcoin.spl.Block;

import static com.splashcoin.spl.splashfiles.SplashFile.importBlockChain;

public class getBlockChain {
    public static void getBlockChain() {
        Integer blockNum = 1;
        for (Object block : importBlockChain()) {
//            System.out.println(block);
            System.out.println("\n\n#### Displaying Block Number " + blockNum + " ####");

            if( block instanceof Block) {
                Object id = ((Block)block).id;
                Object message = ((Block)block).message;
                Object sender = ((Block)block).sender;
                Object receiver = ((Block)block).receiver;
                Object previousHash = ((Block)block).previousHash;
                Object hash = ((Block)block).hash;
                System.out.println("id : " + id);
                System.out.println("message : " + message);
                System.out.println("sender : " + sender);
                System.out.println("receiver : " + receiver);
                System.out.println("previous hash : " + previousHash);
                System.out.println("Hash : " + hash);

            }
            System.out.println("#### End of Block Number " + blockNum + " ####");
            blockNum++;
        }
    }
}
