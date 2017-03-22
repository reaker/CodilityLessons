package OddOccurrencesInArray;

import java.util.Arrays;

public class Solution {
    public static int solution(int[] A) {

        boolean[] isPaired= new boolean[A.length];

        int unpaired=0;
        System.out.println(Math.ceil(3.4));

        for (int i = 0; i < A.length; i++) {
            if (isPaired[i])continue;
            if(!isPaired[i]){
                for (int j = i+1; j < A.length; j++) {
                    if (isPaired[j])continue;
                    if (A[i]==A[j]) {isPaired[i]=true; isPaired[j]=true;continue;}
                    System.out.println(j);
                    return A[(j-1)];
                }
            }
        }
        return A[unpaired];
       }

    public static void main(String[] args) {
        int[] A= new int[8];
        A[0] = 3  ;A[1] = 3 ; A[2] = 9;
        A[3] = 3 ; A[4] = 3  ;A[5] = 7;
        A[6] = 9;
        System.out.println(solution(A));
    }
}



