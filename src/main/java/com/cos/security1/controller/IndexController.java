package com.cos.security1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // localhost:8080/
    // localhost:8080
    @GetMapping({"","/"})
    public String index(){

        // 머스테치 기본 폴더: src/main/resources/
        // 뷰리졸버 설정: templates (prefix), .mustache (suffix)
        // 만약 mustache 의존성을 추가하였으면, 설정 파일에 따로 기입할 필요 없음.
        // 리턴 값으로 index만 적어놨을 경우,
        // src/main/resources/templates/index.mustache 를 찾을 것인데,
        // 현재 html 파일을 사용할 것이기에
        // WebMvcConfig 파일에서 설정을 해준다.
        return "index";
    }
}
