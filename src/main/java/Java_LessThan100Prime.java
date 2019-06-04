public class Java_LessThan100Prime {
    public static void main(String[] args) {
        boolean isPrime = false;
        for (int i = 1; i < 100; i++) {
            if (i == 2 || i == 3) {
                System.out.println(i);
            }
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}

