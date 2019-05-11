package cn.kaygod.eurekaclienttwo;

import cn.kaygod.eurekaclienttwo.feign.TestFeignService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestControllerTest {

    @Resource
    private TestFeignService testFeignService;

    @Test
    public void index() {
        String result = testFeignService.findById();
        System.out.println(result);
    }
}