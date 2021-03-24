package ru.enai.bank.domain;

import javax.persistence.*;

@Entity
@Table(name = "credit")
public class Credit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long limitCredit;
    private Integer percent;

    public Credit(Long id, Long limitCredit, Integer percent) {
        this.id = id;
        this.limitCredit = limitCredit;
        this.percent = percent;
    }

    public Credit() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLimitCredit() {
        return limitCredit;
    }

    public void setLimitCredit(Long limitCredit) {
        this.limitCredit = limitCredit;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }
}
