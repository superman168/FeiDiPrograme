package com.tangjie.controller;

import com.tangjie.request.VerificationCodeDTO;
import com.tangjie.service.VerificationCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerificationCodeController {

    @Autowired
    private VerificationCodeService verificationCodeService;
@GetMapping("/verificationCode")
    public String getVerificationcode(@RequestBody VerificationCodeDTO verificationCodeDTO){

        return verificationCodeService.getVerificationCode(verificationCodeDTO);

    }
}
