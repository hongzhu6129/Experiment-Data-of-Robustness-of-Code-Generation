class CountWithoutSeven {

    static int count_nums_not_7(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!String.valueOf(i).contains("7")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 20; // Example input
        int result = count_nums_not_7(n);
        System.out.println("The number of numbers without 7 from 1 to " + n + " is: " + result);

        n = 80; // Another example
        result = count_nums_not_7(n);
        System.out.println("The number of numbers without 7 from 1 to " + n + " is: " + result);


    }
}
