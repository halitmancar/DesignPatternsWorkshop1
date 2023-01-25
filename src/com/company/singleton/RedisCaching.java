package com.company.singleton;

public class RedisCaching implements ICaching{
    private static volatile RedisCaching instance;
    private String message;


    public RedisCaching(String message){
        this.message=message;
    }


    public static RedisCaching getInstance(String message){
        RedisCaching redisCaching = instance;
        if (redisCaching!=null){
            return redisCaching;
        }
        synchronized (RedisCaching.class){
            if (instance==null){
                instance = new RedisCaching(message);
            }
            return instance;
        }
    }

    @Override
    public void cache() {
        System.out.println("Caching...: " + message);
    }

}
