package org.javacore.thread;

import java.util.concurrent.TimeUnit;

/**
 * Thread Interrupt 示例
 * 
 * @author BYSocket
 * @since 16/2/24
 */
public class ThreadInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread inThread = new Thread(new InterrupThread());
        inThread.start();
        TimeUnit.SECONDS.sleep(2);
        inThread.interrupt();
    }
}
class InterrupThread implements Runnable {

    private int num = 1;
    @Override
    public void run() {
        while (!Thread.interrupted()) {
            System.out.println("true ----> " + num++);
        }
    }
}
