package com.grpc.xbank.web.dto;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class XBankAuthResponse {
    private String orderId;
    private String responseCode;
    private String message;
    private boolean isThreeD;
}
