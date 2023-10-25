package com.fjp;

import java.util.HashMap;
import java.util.Map;

public class Table {
    protected Map<String, Integer> counter;

    Table(){
        this.counter = new HashMap<>();
        this.counter.put("table", 1);
    }
}
