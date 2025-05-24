package StackAndQueue;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    int size;
    ArrayDeque<Map<Integer,Integer>> deque;
    Map<Integer,Integer> map;

    public LRUCache(int n) {
        size=n;
        deque=new ArrayDeque<>();
        map=new HashMap<>();
    }
    private void put(int x, int y) {
        map.put(x,y);
        deque.push(map);
    }

    private int get(int x) {
        return map.get(x);
    }
    public static void main(String[] args) {
        LRUCache lruCache=new LRUCache(4);

        lruCache.put(2,6);
        lruCache.put(4,7);
        lruCache.put(8,11);
        lruCache.put(7,10);
        System.out.println(lruCache.get(2));
        System.out.println(lruCache.get(8));
        lruCache.put(5,6);
        System.out.println(lruCache.get(7));
        lruCache.put(5,7);
    }




}
