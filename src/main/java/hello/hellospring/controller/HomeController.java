package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
        //index.html 보다 home.html을 먼저 찾은 이유
        //controller에서 "/" 매핑된게 있으면 이걸 먼저 찾고
        //없으면 index.html을 찾아서 반환하는
        //스프링 내부의 우선순위가 있기 때문에
    }
}
