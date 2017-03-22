package Distinct;

import java.util.*;

//to zadanie udalo mi sie zrobic na 100%/100% za pierwszym podejsciem :))))))))))

public class Solution {
    public int solution(int[] A) {

        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        return set.size();

    }
}
