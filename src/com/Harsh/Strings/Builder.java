package com.Harsh.Strings;

public class Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<26;i++){
            char ch = (char)('a' + i);
            sb.append(ch);
        }
        System.out.println(sb.toString());

        sb.deleteCharAt(0);
        System.out.println(sb.toString());
    }
}
