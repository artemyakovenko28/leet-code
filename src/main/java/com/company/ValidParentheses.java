package com.company;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParentheses {

    public boolean isValid(String s) {
        Deque<Character> sequence = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                sequence.push(ch);
            } else if (sequence.isEmpty()) {
                return false;
            } else if (ch == ')') {
                if (!sequence.pop().equals('(')) {
                    return false;
                }
            } else if (ch == '}') {
                if (!sequence.pop().equals('{')) {
                    return false;
                }
            } else if (ch == ']') {
                if (!sequence.pop().equals('[')) {
                    return false;
                }
            }
        }
        return sequence.isEmpty();
    }
}
