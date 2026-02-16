Buffer buffer = new Buffer(1);

new Thread(() -> {
    try {
        buffer.put(1);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}).start();

new Thread(() -> {
    try {
        buffer.put(2);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}).start();
