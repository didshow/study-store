package test_0911;

import java.util.concurrent.Semaphore;

public class MultiThreading {
    private static final int MAX_PEACHES = 5;
    private static Semaphore plateSemaphore = new Semaphore(1);
    private static Semaphore eatSemaphore = new Semaphore(0);

    static class Parent implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    // 父母等待盘子空出
                    plateSemaphore.acquire();
                    System.out.println("父母放入桃子");
                    Thread.sleep(1000); // 模拟放入桃子的时间
                    // 释放盘子，唤醒等待的孩子
                    plateSemaphore.release();
                    eatSemaphore.release(); // 唤醒一个孩子来吃桃子
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Child implements Runnable {
        private String name;
        private int eatSpeed;

        public Child(String name, int eatSpeed) {
            this.name = name;
            this.eatSpeed = eatSpeed;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    // 孩子等待盘子中有桃子
                    eatSemaphore.acquire();
                    System.out.println(name + "取走桃子");
                    Thread.sleep(eatSpeed); // 模拟吃桃子的时间
                    System.out.println(name + "吃完桃子");
                    // 检查盘子是否还有桃子
                    if (eatSemaphore.availablePermits() == 0) {
                        // 唤醒一个孩子继续吃桃子
                        eatSemaphore.release();
                    } else {
                        // 没有桃子了，父亲或母亲需要放桃子
                        plateSemaphore.release();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child1 = new Child("老大", 1500); // 吃桃速度：1500ms
        Child child2 = new Child("老二", 2000); // 吃桃速度：2000ms
        Child child3 = new Child("老三", 1000); // 吃桃速度：1000ms

        Thread t1 = new Thread(parent);
        Thread t2 = new Thread(child1);
        Thread t3 = new Thread(child2);
        Thread t4 = new Thread(child3);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
