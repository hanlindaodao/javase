package com.daodao04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *     需求：创建一个HashMap集合，存储三个键值对元素，每一个键值对元素的键是String，值是ArrayList，
 *          每一个ArrayList的元素是String，并遍历
 *
 *     思路：
 *         1:创建HashMap集合
 *         2:创建ArrayList集合，并添加元素
 *         3:把ArrayList作为元素添加到HashMap集合
 *         4:遍历HashMap集合
 *
 *     给出如下的数据:
 *         第一个ArrayList集合的元素：(三国演义)
 *   		    诸葛亮
 *   		    赵云
 *         第二个ArrayList集合的元素：(西游记)
 *   		    唐僧
 *   		    孙悟空
 *         第三个ArrayList集合的元素：(水浒传)
 *   		    武松
 *   		    鲁智深
 */

public class Anli02 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

        ArrayList<String> list_1 = new ArrayList<String>();
        list_1.add("诸葛亮");
        list_1.add("赵云");

        ArrayList<String> list_2 = new ArrayList<String>();
        list_2.add("唐僧");
        list_2.add("孙悟空");

        ArrayList<String> list_3 = new ArrayList<String>();
        list_3.add("武松");
        list_3.add("鲁智深");

        map.put("三国演义", list_1);
        map.put("西游记", list_2);
        map.put("水浒传", list_3);

        // 遍历方法一：
        Set<Map.Entry<String, ArrayList<String>>> entrySet = map.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entrySet) {
            String key = entry.getKey();
            System.out.println("key: " + key);
            System.out.println("value: ");
            ArrayList<String> values = entry.getValue();
            for (String value : values) {
                System.out.println(value);
            }
            System.out.println("------------------");
        }

        // 遍历方法二：
        System.out.println("*******************************");
        Set<String> keyset = map.keySet();
        for (String key : keyset) {
            System.out.println("key: " + key);
            System.out.println("value: ");
            ArrayList<String> values = map.get(key);
            for (String value : values) {
                System.out.println(value);
            }
            System.out.println("------------------");
        }


    }
}
