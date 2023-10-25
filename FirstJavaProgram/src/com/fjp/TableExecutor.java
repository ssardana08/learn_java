package com.fjp;

import java.util.Map;

public class TableExecutor {
    public void run(Map<String, Integer> counter){
        counter.put("Table executor", 1);
        for (String key: counter.keySet()){
            System.out.printf("%s: %d \n", key, counter.get(key));
        }
        System.out.println();
    }
}
