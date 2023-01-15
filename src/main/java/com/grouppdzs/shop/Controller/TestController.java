package com.grouppdzs.shop.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@RestController
public class TestController {
    @RequestMapping("/test")
    public String Test(){
        return "test";
    }
}
