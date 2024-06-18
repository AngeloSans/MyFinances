package com.projeto.MyFinances.Application.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountsDTO {
    private Long id;

    private String accountName;
    private Date date;
    private String formPayment;
    private double paymentValue;
    private boolean situation;
}
