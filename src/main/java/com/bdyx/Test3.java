package com.bdyx;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbc"));
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] a = s.toCharArray();
        List<Character> list = new ArrayList<Character>();
        if (a.length == 0) {
            return 0;
        } else {
            int num = 1;
            for (int j = 0; j < a.length; j++) {
                for (int i = j; i < a.length; i++) {
                    if (list.contains(a[i]) == false) list.add(a[i]);
                    else {
                        if (list.size() >= num) {
                            num = list.size();
                            //System.out.println(list.size());
                        }
                        list.clear();
                        break;
                    }
                }
            }
            return num;
        }
    }
}
