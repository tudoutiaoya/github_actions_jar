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

    @GetMapping("/test2")
    public Result test2() {
        return Result.success("teset2");
    }

    @GetMapping("/test3")
    public Result test3() {
        return Result.success("teset3");
    }




}
