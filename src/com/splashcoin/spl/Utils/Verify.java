package com.splashcoin.spl.Utils;

import com.splashcoin.spl.Block;
import com.splashcoin.spl.BlockChain;

import java.math.BigInteger;

public class Verify {
    public static Boolean verifyBlockChain() {
        Integer i = 1;
        BigInteger previousHash;
        BigInteger definedPH;
        for (Object block : BlockChain.BlockChain) {
            Integer id = ((Block)block).id;
            if (id == 1){
                i++;
                continue;
            }
            definedPH = ((Block) block).previousHash;
            Object previousBlock = BlockChain.BlockChain.get(i - 2);
//            System.out.println(definedPH);
            previousHash = ((Block)previousBlock).hash;
//            System.out.println(previousHash);
            Integer t = i-1;
            if (definedPH != previousHash) {
                System.out.println("Invalid Block " + t);
                return false;
            }
            i++;
            continue;
        }
        return true;
    }
}
