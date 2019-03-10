package com.splashcoin.spl.Utils;

import com.splashcoin.spl.BlockChain;

public class getCurrentId {
    /*
        Get Current Number of BLocks
     */
    public static Integer getCurrentId() {
        Integer n = 0;
        for( Object block : BlockChain.BlockChain) {
            n++;
        }
        return n;
    }
}
