package CountDiv;

public class Solution {
    public static int solution(int A, int B, int K) {
        //chyba pierwszy program który ma 100% Correctnes i 100% performance
        int counter=0;

        for (int i = A; i <= B;i++) {

           if (i%K==0){return ((B-i)/K)+1 ;}
        }
        return counter;

    }

    public static void main(String[] args) {
        int A,B,K;
        A=0;
        B=1;
        K=11;

        System.out.println(solution(A,B,K));
    }
}
