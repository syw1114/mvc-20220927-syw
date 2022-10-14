package com.study.mvc20220927syw.builder;

public class UserMain {
    public static void main(String[] args) {
        //User안에 UserBuilder라는 생성자가 존재.  "." 점을 찍으면 주소 참조가 돼야함.
        User user = User.UserBuilder.UserBuilder() // 계속 this를 리턴해서 참조를 계속할수있음.
                    .username("SYW")
                    .password("1234")
                    .name("준일")
                    //마지막에 build를 호출함으로써 build를 생성함. return user을 하면서 User이 생성됨.
                    .build();
    }
}
