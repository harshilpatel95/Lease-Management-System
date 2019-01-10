/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author patels
 */
@Entity
@Table(name = "buy")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Buy.findAll", query = "SELECT b FROM Buy b"),
    @NamedQuery(name = "Buy.findByBid", query = "SELECT b FROM Buy b WHERE b.bid = :bid"),
    @NamedQuery(name = "Buy.findByAmount", query = "SELECT b FROM Buy b WHERE b.amount = :amount"),
    @NamedQuery(name = "Buy.findByDate", query = "SELECT b FROM Buy b WHERE b.date = :date"),
    @NamedQuery(name = "Buy.findByTxnId", query = "SELECT b FROM Buy b WHERE b.txnId = :txnId")})
public class Buy implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "bid")
    private Integer bid;
    @Basic(optional = false)
    @Column(name = "amount")
    private String amount;
    @Column(name = "date")
    private String date;
    @Column(name = "txn_id")
    private String txnId;
    @JoinColumn(name = "pid", referencedColumnName = "pid")
    @ManyToOne(optional = false)
    private Addproperty pid;
    @JoinColumn(name = "lid", referencedColumnName = "lid")
    @ManyToOne(optional = false)
    private Login lid;

    public Buy() {
    }

    public Buy(Integer bid) {
        this.bid = bid;
    }

    public Buy(Integer bid, String amount) {
        this.bid = bid;
        this.amount = amount;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public Addproperty getPid() {
        return pid;
    }

    public void setPid(Addproperty pid) {
        this.pid = pid;
    }

    public Login getLid() {
        return lid;
    }

    public void setLid(Login lid) {
        this.lid = lid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bid != null ? bid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Buy)) {
            return false;
        }
        Buy other = (Buy) object;
        if ((this.bid == null && other.bid != null) || (this.bid != null && !this.bid.equals(other.bid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Buy[ bid=" + bid + " ]";
    }
    
}
