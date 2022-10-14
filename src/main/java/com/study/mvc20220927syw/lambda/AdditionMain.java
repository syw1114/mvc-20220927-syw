package com.study.mvc20220927syw.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class AdditionMain {
    public static void main(String[] args){

        Addition addition = new Addition() {
            @Override
            //익명클래스 : 인터페이스를 new 할때 구현부를 만들어주는것
            //이름이없는 클래스를 만들어서 업캐스팅을해서 대입하고있는것.
            //해당클래스.add
            public int add(int[] numbers) {
                int result = 0;
                for(int num : numbers){
                   result += num;
               }
                return result;
            }
        };

        Addition addition2 = (numbers -> {
            int result = 0;
            for(int num : numbers){
                result += num;
            }
            return result;
        });

        BiFunction<Integer[],Integer[] ,Integer> addition3 = (a,b)  -> {
            int result = 0;
            for(int num : a){
                result += num;
            }
            for(int num : b){
                result += num;
            }
            return result;
        };

        BiFunction<Integer,Integer,Integer> addition4 = (num1,num2)  -> num1 + num2;
        int result1 = addition.add(new int[] {1,2,3,4,5,6,7,8,9,10});
        System.out.println("결과1: " + result1);

        int result2 = addition2.add(new int[] {1,2,3,4,5,6,7,8,9,10});
        System.out.println("결과1: " + result2);

        int result3 = addition3.apply(new Integer[] {1,2,3,4,5,6,7,8,9,10}, new Integer[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println("결과1: " + result3);
    }
}
