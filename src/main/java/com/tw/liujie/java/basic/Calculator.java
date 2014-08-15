package com.tw.liujie.java.basic;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jjliu on 8/10/14.
 */
public class Calculator {

    public static final char ADD = '+';
    public static final char SUB = '-';
    public static final char MUL = '*';
    public static final char DIV = '/';
    public static final String OPERATOR = "+-*/";


    public String calculate(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Input string is not an arithmetical expression");
        }

        List<String> numbers = new ArrayList<String>();
        List<Character> operators = new ArrayList<Character>();

        StringBuffer aNumberTemp = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char expressionChar = s.charAt(i);
            if (OPERATOR.indexOf(expressionChar) > -1) {
                operators.add(expressionChar);
                numbers.add(aNumberTemp.toString());
                aNumberTemp = new StringBuffer();
            } else {
                aNumberTemp.append(expressionChar);
            }
            if(i==s.length()-1){
                numbers.add(aNumberTemp.toString());
            }
        }

        double result = Double.valueOf(numbers.get(0));
        for (int j = 1; j < numbers.size(); j++) {
            Character aOperator=operators.get(j-1);
            switch (aOperator){
                case ADD:
                    result+=Double.valueOf(numbers.get(j));
                    break;
                case SUB:
                    result-=Double.valueOf(numbers.get(j));
                    break;
                case MUL:
                    result*=Double.valueOf(numbers.get(j));
                    break;
                case DIV:
                    result/=Double.valueOf(numbers.get(j));
                    break;

            }
        }
        NumberFormat format = NumberFormat.getInstance();
        format.setMaximumFractionDigits(4);

        return format.format(result);
    }


}
