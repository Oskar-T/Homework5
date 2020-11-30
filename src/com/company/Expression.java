package com.company;

public class Expression {

    public String[] arr;

    public Expression(String[] arr) {
        this.arr = arr;
    }

    public int evaluate() {
        int first = Integer.parseInt(arr[0]);
        int second = Integer.parseInt(arr[2]);

        if(arr[1].equals("+")) {
            return first + second;
        } else if(arr[1].equals("-")) {
            return first - second;
        } else if(arr[1].equals("*")) {
            return first * second;
        } else if(arr[1].equals("/")) {
            return first/second;
        }
        return -1;
    }

}
