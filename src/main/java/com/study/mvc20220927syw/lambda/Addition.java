package com.study.mvc20220927syw.lambda;

//람다로쓸 인터페이스를 사용할려면 FunctionalInterface 를 사용해야한다.
@FunctionalInterface
public interface Addition {
    public int add(int[] numbers);
}
