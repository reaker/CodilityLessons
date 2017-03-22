package FrogJump;

class Solution {
    public int solution(int X, int Y, int D) {
        //100% w testach
        if (X==Y) return 0;
        double result=((double)Y-(double)X)/((double)D);
        return (int)Math.ceil(result);
    }
}