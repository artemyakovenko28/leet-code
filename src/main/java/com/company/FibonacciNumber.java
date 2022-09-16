package com.company;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber {

    private final Map<Integer, Integer> memory = new HashMap<>();

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        if (memory.containsKey(n)) {
            return memory.get(n);
        }
        memory.put(n, fib(n - 1) + fib(n - 2));
        return memory.get(n);
    }
}
