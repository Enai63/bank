package ru.enai.bank.calculator;



import org.hibernate.annotations.Tables;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;


@Component
@Entity
public class PaymentSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date date;
    private Integer payment;
    private Integer paymentBodyCredit;
    private Integer paymentPercent;
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");

    public PaymentSchedule() {
    }

    public PaymentSchedule(Date date, Integer payment, Integer paymentBodyCredit, Integer paymentPercent) {
        dateFormat(date);
        this.date = date;
        this.payment = payment;
        this.paymentBodyCredit = paymentBodyCredit;
        this.paymentPercent = paymentPercent;
    }

    private void dateFormat(Date date) {
        simpleDateFormat.format(date);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public Integer getPaymentBodyCredit() {
        return paymentBodyCredit;
    }

    public void setPaymentBodyCredit(Integer paymentBodyCredit) {
        this.paymentBodyCredit = paymentBodyCredit;
    }

    public Integer getPaymentPercent() {
        return paymentPercent;
    }

    public void setPaymentPercent(Integer paymentPercent) {
        this.paymentPercent = paymentPercent;
    }
}
