package com.tangjie.serviceverificationcode.controller;

import com.tangjie.internalcommon.dto.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberCodeController {

    @GetMapping("/numberCode/{size}")
    public ResponseResult numberCode(@PathVariable("size") int size){

        System.out.println("size:" + size);

        int code = (int)((Math.random() * 9 + 1)  * Math.pow(10, size - 1));

        return ResponseResult.success(code);

    }
}
