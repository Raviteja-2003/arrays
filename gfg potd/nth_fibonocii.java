class Solution {
    static int nthFibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int n1 = 0;
        int n2 = 1;
        int k=1000000007;
        for (int i = 2; i <= n; i++) {
            int temp = (n1 + n2)%k;
            n1 = n2;
            n2 = temp;
        }

        return n2;
    }
}