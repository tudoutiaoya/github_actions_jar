package com.zzqedu.controller;

import com.zzqedu.common.res.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test1")
    public Result test1() {
        return Result.success("teset1");
    }



}
