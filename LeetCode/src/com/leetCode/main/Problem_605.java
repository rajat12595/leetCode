package com.leetCode.main;

public class Problem_605 {

        public static boolean canPlaceFlowers(int[] flowerbed, int n) {

            // TEST- 1
//        if(flowerbed.length == 1 && flowerbed[0] == 0){
//            n--;
//            return n <= 0;
//        }
//        for (int i = 0; i <flowerbed.length; ) {
//            if (i == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
//                n--;
//                i = i + 2;
//            }
//            else if (i == (flowerbed.length - 1) && flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
//                n--;
//                i = i + 2;
//            }else if(i == 0 || i == (flowerbed.length - 1)){
//                i++;
//            }
//            else if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
//                n--;
//                i = i + 2;
//            }
//            else i++;
//        }
//        return n <= 0;

            for (int i = 0; i <flowerbed.length; ) {
                if(flowerbed[i] != 0){
                    i++;
                    continue;
                }
                int prev = (i==0) ? 0 : flowerbed[i-1];
                int next = (i== flowerbed.length -1 ) ? 0 : flowerbed[i+1];
                if(next == 0 && prev == 0 ){
                    n--;
                    i = i+2;
                }
                else i++;

            }
            return n <= 0;
    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{0,1,0} ,1));
    }
}
