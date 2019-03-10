package com.splashcoin.spl;

import java.io.Serializable;
import java.math.BigInteger;

public class Block implements Serializable {
    /*
        Set Block Variables;
     */
    public int id;
    public String message;
    public String sender;
    public String receiver;
    public BigInteger hash;
    public BigInteger previousHash;
    // ############################## //

}
