package com.daodao03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 键值对的遍历
 * Set<Map.Entry<K,V>> entrySet()：获取所有键值对对象的集合
 */

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> hMap = new HashMap<Integer, String>();

        hMap.put(1, "daodao");
        hMap.put(3, "zhu");
        hMap.put(2, "who");

        // 方法1，通过键找值
        Set<Integer> keys = hMap.keySet();
        for (Integer key : keys) {
            String value = hMap.get(key);
            System.out.println(key + "-->" + value);
        }

        System.out.println("------------");
        // 方法2，通过键值对对象的关系来遍历
        Set<Map.Entry<Integer, String>> entrySet = hMap.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-->" + value);
        }

        System.out.println(hMap);
    }
}
