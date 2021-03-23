package ru.enai.bank.calculator;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
@Component
public class CalculatePaymentSchedule {
    List<PaymentSchedule> paymentScheduleList;
    private Date date;
    private Double summaCredit;
    private Double percent;
    private int years;

}
