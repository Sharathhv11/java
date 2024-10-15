class Maths {

    public static boolean palindrome(int n) {
        int result = reveseNum(n);
        return result == n;
    }

    public static int reveseNum(int n) {
        int reverse = 0;
        while (n > 0) {
            reverse = reverse * 10 + (n % 10);
            n = n / 10;
        }

        return reverse;
    }

    public static boolean amstrongNumber(int n) {
        int ref = n, sum = 0;
        while (ref > 0) {
            int rem = ref % 10;
            sum = sum + (rem * rem * rem);
            ref /= 10;
        }

        return n == sum;

    }

    public static boolean isPrime(int n) {
        // this function checks weather given number is prime or not with time
        // complexity of O(n)
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        return count == 2;
    }

    public static boolean prime(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i)
                    count++;
            }
        }
        return count == 2;
    }

    public static void divisors(int n) {
        // ?this function finds all the divisors of the given number with time
        // complexity of O(n)
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
    }

    public static void divisorsBetterTC(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if ((n / i) != i) {
                    System.out.println(n / i);
                }
            }
        }
    }

    public static int highestCommanFactor(int n1, int n2) {
        for (int i = Math.min(n1, n2); i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }

        return 1;
    }

    public static int qualadinHCF(int n1, int n2) {
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
               
                n1 = n1 % n2;
            } else {
               
                n2 = n2 % n1;
            }
        }

        return Math.max(n1, n2);
    }

    public static void main(String argu[]) {

        System.out.println(qualadinHCF(9, 12));

    }
}