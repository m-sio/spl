package com.splashcoin.spl.Utils;

import com.splashcoin.spl.Block;
import com.splashcoin.spl.BlockChain;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {
    public static BigInteger checksum(Object obj) throws IOException, NoSuchAlgorithmException {

        if (obj == null) {
            return BigInteger.ZERO;
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(obj);
        oos.close();

        MessageDigest m = MessageDigest.getInstance("SHA1");
        m.update(baos.toByteArray());

        return new BigInteger(1, m.digest());
    }

    public static BigInteger getPreviousHash() {
        Integer current = getCurrentId.getCurrentId();
        Integer i = 1;
        BigInteger previousHash = null;
        for (Object block : BlockChain.BlockChain) {
            if (i == current) {
                previousHash = ((Block) block).hash;
//                System.out.println(previousHash);
                return previousHash;
            }
            i++;
        }
        return previousHash;
    }

    public BigInteger getHash(Integer i){
        Object block = BlockChain.BlockChain.get(i);
        BigInteger hash = ((Block) block).hash;
        return hash;
    }
}
