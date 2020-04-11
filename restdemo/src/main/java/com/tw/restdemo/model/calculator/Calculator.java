package com.tw.restdemo.model.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {


    public float calculate(String input) {

        List<String> stringList = Arrays.asList(input.split("\\+"));
        List<String> operators = Arrays.asList(input.split("\\[0-9]]"));
        System.out.println(operators);
         ArrayList<Float> numbers = new ArrayList<Float>();
        for (String s : stringList) {
            numbers.add(Float.valueOf(s.trim()));
        }
        int result = 0;
        for (Float number : numbers) {
            result += number;
        }
        return result;
    }
}
