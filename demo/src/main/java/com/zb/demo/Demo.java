package com.zb.demo;

import redis.clients.jedis.Jedis;

import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        String i = "1";
        String i1 = "2";

        System.out.println(i.hashCode());
        System.out.println(i1.hashCode());
    }
}
