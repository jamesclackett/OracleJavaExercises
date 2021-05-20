package com.jimboidin.test;

class Solution {
    public void solution(int N) {
        int enable_print = N % 10;
        while (N > 0) {
            if (enable_print == 0 && N % 10 != 0) {
                enable_print = 1;
            }
            else if (enable_print == 1) {
                System.out.print(N % 10);
            }
            else {
            System.out.print(N % 10); }
            N = N / 10;
        }
    }
}

class Test {
    public static void main(String[] args){
        Solution s = new Solution();
        s.solution(91019);
    }
}
