class Solution {
    public int fib(int n) {

        if (n <= 1) {
            return n;
        }

        int prev = 0;
        int curr = 1;

        for (int i = 1; i < n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }
}