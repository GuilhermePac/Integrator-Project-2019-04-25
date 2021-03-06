package model;
// Generated 25/04/2019 00:40:20 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Request generated by hbm2java
 */
@Entity
@Table(name="request"
    ,schema="gcsystem"
)
public class Request  implements java.io.Serializable {


     private int code;
     private Guestcheck guestcheck;
     private Tablelist tablelist;
     private Userlogin userlogin;
     private String status;
     private Date datetimeins;
     private Date datetimeend;
     private BigDecimal paymoney;
     private BigDecimal paycard;
     private String cardtype;
     private Set<Requestitem> requestitems = new HashSet<Requestitem>(0);

    public Request() {
    }

	
    public Request(int code, Guestcheck guestcheck, Tablelist tablelist, Userlogin userlogin) {
        this.code = code;
        this.guestcheck = guestcheck;
        this.tablelist = tablelist;
        this.userlogin = userlogin;
    }
    public Request(int code, Guestcheck guestcheck, Tablelist tablelist, Userlogin userlogin, String status, Date datetimeins, Date datetimeend, BigDecimal paymoney, BigDecimal paycard, String cardtype, Set<Requestitem> requestitems) {
       this.code = code;
       this.guestcheck = guestcheck;
       this.tablelist = tablelist;
       this.userlogin = userlogin;
       this.status = status;
       this.datetimeins = datetimeins;
       this.datetimeend = datetimeend;
       this.paymoney = paymoney;
       this.paycard = paycard;
       this.cardtype = cardtype;
       this.requestitems = requestitems;
    }
   
     @Id 

    
    @Column(name="code", nullable=false)
    public int getCode() {
        return this.code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="code_guestcheck", nullable=false)
    public Guestcheck getGuestcheck() {
        return this.guestcheck;
    }
    
    public void setGuestcheck(Guestcheck guestcheck) {
        this.guestcheck = guestcheck;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="code_tablelist", nullable=false)
    public Tablelist getTablelist() {
        return this.tablelist;
    }
    
    public void setTablelist(Tablelist tablelist) {
        this.tablelist = tablelist;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="code_userlogin", nullable=false)
    public Userlogin getUserlogin() {
        return this.userlogin;
    }
    
    public void setUserlogin(Userlogin userlogin) {
        this.userlogin = userlogin;
    }

    
    @Column(name="status", length=20)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="datetimeins", length=29)
    public Date getDatetimeins() {
        return this.datetimeins;
    }
    
    public void setDatetimeins(Date datetimeins) {
        this.datetimeins = datetimeins;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="datetimeend", length=29)
    public Date getDatetimeend() {
        return this.datetimeend;
    }
    
    public void setDatetimeend(Date datetimeend) {
        this.datetimeend = datetimeend;
    }

    
    @Column(name="paymoney", precision=6)
    public BigDecimal getPaymoney() {
        return this.paymoney;
    }
    
    public void setPaymoney(BigDecimal paymoney) {
        this.paymoney = paymoney;
    }

    
    @Column(name="paycard", precision=6)
    public BigDecimal getPaycard() {
        return this.paycard;
    }
    
    public void setPaycard(BigDecimal paycard) {
        this.paycard = paycard;
    }

    
    @Column(name="cardtype", length=2)
    public String getCardtype() {
        return this.cardtype;
    }
    
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="request")
    public Set<Requestitem> getRequestitems() {
        return this.requestitems;
    }
    
    public void setRequestitems(Set<Requestitem> requestitems) {
        this.requestitems = requestitems;
    }




}


