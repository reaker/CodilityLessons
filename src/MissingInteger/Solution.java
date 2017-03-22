package MissingInteger;

import java.util.Arrays;

public class Solution {
    public static int solution(int A[]) {
        Arrays.sort(A);
        if (A.length==1 && A[0]>0) return A[0];

        int result=0;
        for (int i = 0; i < A.length-1; i++) {
            if (A[i]==A[i+1] || ((A[i+1]-A[i])==0)) continue;
            result=A[i]+1;
        }

        return result;

    }

    public static void main(String[] args) {
        int[] A=new int[6];
        A[0] = 1;
        A[1] = 3;
        A[2] = 6;
        A[3] = 4;
        A[4] = 1;
        A[5] = 2;

        System.out.println(solution(A));
    }
}
