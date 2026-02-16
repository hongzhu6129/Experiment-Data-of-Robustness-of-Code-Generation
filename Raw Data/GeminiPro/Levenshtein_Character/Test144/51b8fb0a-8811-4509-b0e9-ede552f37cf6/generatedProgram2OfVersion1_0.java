Buffer buffer = new Buffer(10);

new Thread(() -> {
    for (int i = 0; i < 100; i++) {
        try {
            buffer.put(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}).start();

new Thread(() -> {
    for (int i = 0; i < 100; i++) {
        try {
            int item = buffer.get();
            System.out.println("Retrieved item: " + item);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}).start();
