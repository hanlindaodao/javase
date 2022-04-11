package com.daodao04;

import java.util.*;

/**
 *     需求：
 *         创建一个ArrayList集合，存储三个元素，每一个元素都是HashMap，每一个HashMap的键和值都是String，并遍历
 *
 *     思路：
 *         1:创建ArrayList集合
 *         2:创建HashMap集合，并添加键值对元素
 *         3:把HashMap作为元素添加到ArrayList集合
 *         4:遍历ArrayList集合
 *
 *     给出如下的数据:
 *         第一个HashMap集合的元素：
 *   		    孙策		大乔
 *   		    周瑜		小乔
 *         第二个HashMap集合的元素：
 *   		    郭靖		黄蓉
 *   		    杨过		小龙女
 *         第三个HashMap集合的元素：
 *   		    令狐冲	任盈盈
 *   		    林平之	岳灵珊
 */

public class Anli {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> map_1 = new HashMap<String, String>();
        map_1.put("孙策", "大乔");
        map_1.put("周瑜", "小乔");

        HashMap<String, String> map_2 = new HashMap<String, String>();
        map_2.put("郭靖", "黄蓉");
        map_2.put("杨过", "小龙女");

        HashMap<String, String> map_3 = new HashMap<String, String>();
        map_3.put("令狐冲", "任盈盈");
        map_3.put("林平之", "岳灵珊");

        list.add(map_1);
        list.add(map_2);
        list.add(map_3);

/*
        // 怕忘了迭代器
        Iterator<HashMap<String, String>> iterator = list.iterator();
        while (iterator.hasNext()) {
            HashMap<String, String> next = iterator.next();
//            ...
        }
*/

        // 遍历方法一：
        for (HashMap<String, String> map : list) {
            Set<String> keyset = map.keySet();
            for (String key : keyset) {
                String value = map.get(key);
                System.out.println(key + "-->" + value);
            }
            System.out.println("----------");
        }
        System.out.println("***********");

        // 遍历方法二：
        for (HashMap<String, String> map : list) {
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            for (Map.Entry<String, String> entry : entrySet) {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key + "-->" + value);
            }
            System.out.println("----------");
        }


    }
}
