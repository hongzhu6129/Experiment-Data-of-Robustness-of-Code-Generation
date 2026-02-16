Buffer buffer = new Buffer(10);

List<Thread> threads = new ArrayList<>();

for (int i = 0; i < 100; i++) {
    threads.add(new Thread(() -> {
        try {
            buffer.put(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }));

    threads.add(new Thread(() -> {
        try {
            int item = buffer.get();
            System.out.println("Retrieved item: " + item);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }));
}

for (Thread thread : threads) {
    thread.start();
}
