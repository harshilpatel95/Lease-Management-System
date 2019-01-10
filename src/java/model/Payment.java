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
@Table(name = "payment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payment.findAll", query = "SELECT p FROM Payment p"),
    @NamedQuery(name = "Payment.findByPayid", query = "SELECT p FROM Payment p WHERE p.payid = :payid"),
    @NamedQuery(name = "Payment.findByPid", query = "SELECT p FROM Payment p WHERE p.pid = :pid"),
    @NamedQuery(name = "Payment.findByAmmount", query = "SELECT p FROM Payment p WHERE p.ammount = :ammount")})
public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "payid")
    private Integer payid;
    @Basic(optional = false)
    @Column(name = "pid")
    private int pid;
    @Basic(optional = false)
    @Column(name = "ammount")
    private String ammount;
    @JoinColumn(name = "lid", referencedColumnName = "lid")
    @ManyToOne(optional = false)
    private Login lid;

    public Payment() {
    }

    public Payment(Integer payid) {
        this.payid = payid;
    }

    public Payment(Integer payid, int pid, String ammount) {
        this.payid = payid;
        this.pid = pid;
        this.ammount = ammount;
    }

    public Integer getPayid() {
        return payid;
    }

    public void setPayid(Integer payid) {
        this.payid = payid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getAmmount() {
        return ammount;
    }

    public void setAmmount(String ammount) {
        this.ammount = ammount;
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
        hash += (payid != null ? payid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.payid == null && other.payid != null) || (this.payid != null && !this.payid.equals(other.payid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Payment[ payid=" + payid + " ]";
    }
    
}
