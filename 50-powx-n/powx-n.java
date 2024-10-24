class Solution {
    private double pow(double x, int n) {
        if (n == 0) return 1; // Base case: x^0 = 1
        if (n < 0) {
            if (n == Integer.MIN_VALUE) { // Handle edge case for Integer.MIN_VALUE
                return 1 / (pow(x, Integer.MAX_VALUE) * x);
            }
            return 1 / pow(x, -n); // For other negative exponents
        }

        double half = pow(x, n / 2); // Recursively calculate half power

        // If n is even, return half * half, otherwise multiply by x for odd n
        return (n % 2 == 0) ? half * half : half * half * x;
    }

    public double myPow(double x, int n) {
        return pow(x, n); // Call the helper method
    }
}
