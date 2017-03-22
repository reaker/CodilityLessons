package PassingCars;

/**
 * Created by sebastian on 2017-03-20.
 */
public class Solution {
    public static int solution(int[] A) {

        //na poczatku zrobiłem na if'ach, ale poczytalem i tamto rozwiazanie bylo nieefektywne
        // posilkujac sie komentarzami do zadania to rozwiazanie jest duzo madrzejsze bo raz
        // iterujemy po elementach tablicy

        long east=0;   //longi, bo dając zbyt dużego inta możemy przepełnić go
        long passingCars=0;

        for (int i = 0; i < A.length; i++) {
            if (A[i]==0)east++;
            else passingCars+=east;
        }



        return passingCars >1000000000 ? -1 : (int)passingCars;
    }

    public static void main(String[] args) {
        int[] A= new int[5];
        A[0] = 0;
        A[1] = 1;
        A[2] = 0;
        A[3] = 1;
        A[4] = 1;


        System.out.println(solution(A));
    }
}
