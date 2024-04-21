package com.grpc.xbank.web.controller;

import com.grpc.xbank.web.dto.AuthRequest;
import com.grpc.xbank.web.dto.XBankAuthResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/xbank")
public class XbankController {

    @PostMapping("/threeD")
    public XBankAuthResponse payThreeD(@RequestBody AuthRequest request){
        XBankAuthResponse response = XBankAuthResponse.builder()
                .orderId(String.valueOf(new Random().nextInt()))
                .isThreeD(true)
                .responseCode("0000")
                .message("success")
                .build();

        return response;
    }
}
