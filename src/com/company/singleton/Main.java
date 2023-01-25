package com.company.singleton;

public class Main {
    public static void main(String[] args) {

        /*ICaching caching = new RedisCaching("Cacher 1");
        caching.cache();

        ICaching caching1 = new RedisCaching("Cacher 2");
        caching1.cache();

        ICaching caching2 = new RedisCaching("Cacher 3");
        caching2.cache();*/

        /*ICaching caching = RedisCaching.getInstance("Cacher 1");
        caching.cache();

        ICaching caching1 = RedisCaching.getInstance("Cacher 2");
        caching1.cache();

        ICaching caching2 = RedisCaching.getInstance("Cacher 3");
        caching2.cache();*/

        Thread thread = new Thread(new CacherThread1());
        Thread thread1 = new Thread(new CacherThread2());
        thread.start();
        thread1.start();
    }

    static class CacherThread1 implements Runnable{

        @Override
        public void run() {
            ICaching caching = RedisCaching.getInstance("Cacher 1");
            caching.cache();
        }
    }

    static class CacherThread2 implements Runnable{

        @Override
        public void run() {
            ICaching caching = RedisCaching.getInstance("Cacher 2");
            caching.cache();
        }
    }
}

