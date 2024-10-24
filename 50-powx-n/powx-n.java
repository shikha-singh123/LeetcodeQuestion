class Solution {
    private double pow(double x, int n) {
        if (n == 0) return 1; 
        if (n < 0) {
            if (n == Integer.MIN_VALUE) { 
                return 1 / (pow(x, Integer.MAX_VALUE) * x);
            }
            return 1 / pow(x, -n); 
        }

        double half = pow(x, n / 2);

        return (n % 2 == 0) ? half * half : half * half * x;
    }

    public double myPow(double x, int n) {
        return pow(x, n); 
    }
}
