package com.leetCode.main;

public class Problem_717 {
    public static boolean isOneBitCharacter(int[] bits) {
        if(bits.length == 1) return true;
        for(int i = 0; i <= bits.length - 1;){
            if(bits[i] == 0) i++;
            else if(bits[i] ==1) i = i+2;
            if(i == bits.length - 1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isOneBitCharacter(new int[]{1, 1, 1, 0}));
    }
}
