package com.codefinity;

import java.util.concurrent.Semaphore;

public class Worker implements Runnable {
    private final Resource resource;
    private final Semaphore semaphore;

    public Worker(Resource resource, Semaphore semaphore) {
        this.resource = resource;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        //TODO
        try {
            semaphore.acquire();
            resource.use();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            semaphore.release();
        }
    }
}
