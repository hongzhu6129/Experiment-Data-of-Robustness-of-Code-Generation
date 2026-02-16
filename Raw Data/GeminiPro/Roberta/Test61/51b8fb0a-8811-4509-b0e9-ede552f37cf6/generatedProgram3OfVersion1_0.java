Buffer buffer = new Buffer(0);

new Thread(() -> {
    try {
        int item = buffer.get();
        System.out.println("Retrieved item: " + item);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}).start();
