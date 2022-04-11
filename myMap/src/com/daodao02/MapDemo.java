package com.daodao02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 集合获取
 * | V   get(Object key)              | 根据键获取值             |
 * | Set<K>   keySet()                | 获取所有键的集合         |
 * | Collection<V>   values()         | 获取所有值的集合         |
 * | Set<Map.Entry<K,V>>   entrySet() | 获取所有键值对对象的集合 |
 */

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> hMap = new HashMap<Integer, String>();

        hMap.put(1, "daodao");
        hMap.put(3, "zhu");
        hMap.put(2, "who");

        String s = hMap.get(2);
        System.out.println(s);

        Set<Integer> keySet = hMap.keySet();
        System.out.println(keySet);

        Collection<String> values = hMap.values();
        System.out.println(values);



        // 初始输出为{1=daodao, 2=who, 3=zhu}，可以看出自动拍虚了
        System.out.println(hMap);
    }
}
