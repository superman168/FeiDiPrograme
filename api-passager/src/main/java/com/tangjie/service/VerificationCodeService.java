package com.tangjie.service;

import com.syntaxphoenix.syntaxapi.json.JsonObject;
import com.tangjie.request.VerificationCodeDTO;
import org.springframework.stereotype.Service;

@Service
public class VerificationCodeService {

    public String getVerificationCode(VerificationCodeDTO verificationCodeDTO){


        String passengerPhone = verificationCodeDTO.getPassengerPhone();

        System.out.println("需要发送验证吗的手机号：" + passengerPhone);

        System.out.println("调用验证码服务系统发送验证");

        System.out.println("将验证码存储到redis中去");

        JsonObject result = new JsonObject();
        result.set("code","123456");
        result.set("message","success");


        return result.toString();

    }
}
