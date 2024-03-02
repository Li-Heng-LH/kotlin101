package me.liheng;

public class CallKtFromJava {

    public static void main(String[] args) {
        Integer out = UtilsKt.increment(2);
        System.out.println(out);
    }
}
