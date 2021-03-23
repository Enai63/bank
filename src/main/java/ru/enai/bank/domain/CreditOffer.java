package ru.enai.bank.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import ru.enai.bank.calculator.PaymentSchedule;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "creditoffer")
public class CreditOffer {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   private Client client;
   @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   private Credit credit;
   private Integer summaCredit;
   @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   private List<PaymentSchedule> paymentScheduleList; //TODO Calculate credit

   public CreditOffer() {
   }

   public CreditOffer(Long id, Client client, Credit credit, Integer summaCredit, List<PaymentSchedule> paymentScheduleList) {
      this.id = id;
      this.client = client;
      this.credit = credit;
      this.summaCredit = summaCredit;
      this.paymentScheduleList = paymentScheduleList;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Client getClient() {
      return client;
   }

   public void setClient(Client client) {
      this.client = client;
   }

   public Credit getCredit() {
      return credit;
   }

   public void setCredit(Credit credit) {
      this.credit = credit;
   }

   public Integer getSummaCredit() {
      return summaCredit;
   }

   public void setSummaCredit(Integer summaCredit) {
      this.summaCredit = summaCredit;
   }

   public List<PaymentSchedule> getPaymentScheduleList() {
      return paymentScheduleList;
   }

   public void setPaymentScheduleList(List<PaymentSchedule> paymentScheduleList) {
      this.paymentScheduleList = paymentScheduleList;
   }
}
