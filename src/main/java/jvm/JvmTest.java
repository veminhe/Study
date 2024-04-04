package jvm;

import java.util.Random;
import java.util.concurrent.ExecutionException;

public class JvmTest {
    public static void main(String[] args){
        String str = "abcdefghijklm";
        while (true) {
            str += str + new Random().nextInt(999999999) + new Random().nextInt(999999999);
        }
    }
}
