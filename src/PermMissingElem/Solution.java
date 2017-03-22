package PermMissingElem;

public class Solution {

    public static int solution(int[] A) {
        int result = A.length + 1;
        for ( int i = 0; i < A.length; i++) {
            result = result - A[i] + i + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A= new int[4];
        A[0] = 2  ;A[1] = 3 ; A[2] = 1;  A[3] = 5 ;
        System.out.println(solution(A));
    }
}



