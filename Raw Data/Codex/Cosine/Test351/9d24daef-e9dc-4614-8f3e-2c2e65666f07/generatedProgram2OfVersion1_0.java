        long startTime2 = System.nanoTime();

        // Code block 2 to measure
         String testString = "";
        for (int i = 0; i < 100000; i++) {
            testString += "a"; // Simulate some string operations
        }


        long endTime2 = System.nanoTime();

        long elapsedTime2 = endTime2 - startTime2;
        System.out.println("Execution time of Code block 2 in nanoseconds: " + elapsedTime2);
