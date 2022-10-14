package com.study.mvc20220927syw.service;

import com.study.mvc20220927syw.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ts1")
public class TestServiceImpl implements TestService {

    @Autowired //자동확장. 자동으로 연결해준다.
    //개발자가 객체주입을 해주는게아니라 스프링이해줌

   // @Qualifier("tr2") // tr2를 쓰고싶으면 <- 이렇게
    private TestRepository testRepository;

    @Override
    public void logic1() {
        System.out.println("테스트1 클래스에서 logic1 메소드 실행");
        testRepository.insert();
    }

    @Override
    public void logic2() {
        System.out.println("테스트1 클래스에서 logic2 메소드 실행");
        testRepository.select();
    }
}
