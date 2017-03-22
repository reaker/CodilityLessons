package TapeEquilibrium;

import java.util.Arrays;

public class Solution2 {
    public static int solution(int[] A) {

        //tablica z punktami
        int[] arr= new int[A.length-1];

        //liczy sumy lewj i prawej strony
        for (int i = 1; i < A.length; i++) {
            int sumL=0;
            int sumR=0;

            for (int j = 0; j < i; j++) {
                sumL+=A[j];
            }

           for (int j = A.length-1; j >= i; j--) {
                sumR+=A[j];
           }

           //wartosc bezwzgledna przypisywana do tablicy z punkatmi
            arr[i-1]= Math.abs(sumL-sumR);
        }

        //sortowanie i podanie najmniejszej wartosci
        Arrays.sort(arr);
        return arr[0];
    }

    public static void main(String[] args) {
        int[] A= new int[5];
        A[0] = 3;A[1] = 1;A[2] = 2;A[3] = 4;A[4] = 3;
        System.out.println(solution(A));
    }
}
