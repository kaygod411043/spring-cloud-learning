package cn.kaygod.eurekaclienttwo.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author admin
 */
@FeignClient(name = "test-service")
public interface TestFeignService {

    /**
     * @return Object
     */
    @GetMapping(value = "/test")
    String findById();

}
