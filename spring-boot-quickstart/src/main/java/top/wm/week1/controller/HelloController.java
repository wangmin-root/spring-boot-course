package top.wm.week1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: wjh
 * @Date: 2025/9/4
 * @Version: 1.0
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
    @GetMapping("/list")
    public List<String> getlist() {
        return List.of("aaa", "bbb", "ccc");
    }
}
