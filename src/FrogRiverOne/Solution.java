package FrogRiverOne;

import java.util.stream.IntStream;

public class Solution {
    public static int solution(int X, int[] A) {

        //nie jest to super dobre rozwiázanie, ale przynajmniej poprawne
        //
       int time=0;
       int [] b = new int[A.length+1];
        for (int i = 0; i < A.length; i++) {
            b[A[i]]=1;
            time+=1;
            if (IntStream.of(b).sum()==X) return time-1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] A= new int[8];
        A[0] = 1;        A[1] = 3;        A[2] = 1;        A[3] = 4;
        A[4] = 2;        A[5] = 3;        A[6] = 4;        A[7] = 4;

        System.out.println(solution(5,A));
    }
}

