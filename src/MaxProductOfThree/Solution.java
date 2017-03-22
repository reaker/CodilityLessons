package MaxProductOfThree;

import java.util.*;

public class Solution {
    public static int solution(int[] A) {

        List<Integer> triplets= new ArrayList<>();

        int P=0,Q=0,R=0;
        for (int i = 0; i < A.length-2; i++) {
            P=A[i];
            int j=1;
            while (A.length>=i+j){
                if (P>A[i+j])j++;
                else {
                    Q=A[i+j];

                    int k=1;
                    while (A.length>=i+j+k){
                        if (Q>A[i+j+k])k++;
                        else R=A[i+j+k];
                        triplets.add(P*Q*R);
                    }
                }
            }
        }

        Collections.sort(triplets);
        return triplets.get(triplets.size()-1);
    }


    public static void main(String[] args) {
        int[] A=new int[6];
        A[0] = -3;
        A[1] = 1;
        A[2] = 2;
        A[3] = -2;
        A[4] = 5;
        A[5] = 6;
        System.out.println(solution(A));
    }
}
