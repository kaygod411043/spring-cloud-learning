package cn.kaygod.eurekaclienttwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/test")
    public String index(){

        return "test test , eureka-client-two";
    }
}
