package com.grpc.xbank.web.dto;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AuthRequest {
    private String firstName;
    private String lastName;
    private String cardNumber;
    private String cvv;
    private String expireDate;
    private Boolean isThreeD;
    private BigDecimal amount;
}
