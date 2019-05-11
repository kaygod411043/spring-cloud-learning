package cn.kaygod.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 服务消费Controller
 * @author kaygod
 */
@RestController
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer")
    public String consumer(){
        return restTemplate.getForEntity("http://TEST-SERVICE/test",String.class).getBody();
    }



}
