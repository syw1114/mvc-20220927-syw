package com.study.mvc20220927syw.controller;


import com.study.mvc20220927syw.dto.TestReqDto;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Service
public class PageController {

    @GetMapping("/test1")
    public String test1(Model model){
        model.addAttribute("name","김준일");
        return "test_page1";

    }
    @GetMapping("/test2")
    public String test2(){
        System.out.println("test2");
        return "test/test_page2";
    }
    /*@ResponseBody /* 응답을 값으로 하겠다 */
    /* 위에 없으면 자동으로 뷰리절브 */
    @GetMapping("/test3")
    public String test3(Model model, @RequestParam String strData, @RequestParam String name){
        System.out.println(strData);
        System.out.println(name);

        model.addAttribute("data",strData);
        model.addAttribute("name",name);

        return "test/test_page3";
    }

    @GetMapping("/test4")
    public String test4(Model model, TestReqDto testReqDto) {

        System.out.println(testReqDto);

        model.addAttribute("data", testReqDto.getStrData());
        model.addAttribute("name", testReqDto.getName());
        model.addAttribute("number", testReqDto.getNumber());

        return "test/test_page4";
    }

}
