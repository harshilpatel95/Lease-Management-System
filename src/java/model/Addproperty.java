/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author patels
 */
@Entity
@Table(name = "addproperty")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Addproperty.findAll", query = "SELECT a FROM Addproperty a"),
    @NamedQuery(name = "Addproperty.findByPid", query = "SELECT a FROM Addproperty a WHERE a.pid = :pid"),
    @NamedQuery(name = "Addproperty.findByPropertytype", query = "SELECT a FROM Addproperty a WHERE a.propertytype = :propertytype"),
    @NamedQuery(name = "Addproperty.findByPropertyname", query = "SELECT a FROM Addproperty a WHERE a.propertyname = :propertyname"),
    @NamedQuery(name = "Addproperty.findByWantto", query = "SELECT a FROM Addproperty a WHERE a.wantto = :wantto"),
    @NamedQuery(name = "Addproperty.findBySelectcity", query = "SELECT a FROM Addproperty a WHERE a.selectcity = :selectcity"),
    @NamedQuery(name = "Addproperty.findByAddress", query = "SELECT a FROM Addproperty a WHERE a.address = :address"),
    @NamedQuery(name = "Addproperty.findBySaleprice", query = "SELECT a FROM Addproperty a WHERE a.saleprice = :saleprice"),
    @NamedQuery(name = "Addproperty.findByRate", query = "SELECT a FROM Addproperty a WHERE a.rate = :rate"),
    @NamedQuery(name = "Addproperty.findByDescription", query = "SELECT a FROM Addproperty a WHERE a.description = :description"),
    @NamedQuery(name = "Addproperty.findByName", query = "SELECT a FROM Addproperty a WHERE a.name = :name"),
    @NamedQuery(name = "Addproperty.findByEmailid", query = "SELECT a FROM Addproperty a WHERE a.emailid = :emailid"),
    @NamedQuery(name = "Addproperty.findByContact", query = "SELECT a FROM Addproperty a WHERE a.contact = :contact"),
    @NamedQuery(name = "Addproperty.findByPhoto", query = "SELECT a FROM Addproperty a WHERE a.photo = :photo"),
    @NamedQuery(name = "Addproperty.findByStatus", query = "SELECT a FROM Addproperty a WHERE a.status = :status")})
public class Addproperty implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "pid")
    private Integer pid;
    @Column(name = "propertytype")
    private String propertytype;
    @Column(name = "propertyname")
    private String propertyname;
    @Column(name = "wantto")
    private String wantto;
    @Column(name = "selectcity")
    private String selectcity;
    @Column(name = "address")
    private String address;
    @Column(name = "saleprice")
    private String saleprice;
    @Column(name = "rate")
    private String rate;
    @Column(name = "description")
    private String description;
    @Column(name = "name")
    private String name;
    @Column(name = "emailid")
    private String emailid;
    @Column(name = "contact")
    private String contact;
    @Column(name = "photo")
    private String photo;
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "lid", referencedColumnName = "lid")
    @ManyToOne(optional = false)
    private Login lid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pid")
    private Collection<Buy> buyCollection;

    public Addproperty() {
    }

    public Addproperty(Integer pid) {
        this.pid = pid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPropertytype() {
        return propertytype;
    }

    public void setPropertytype(String propertytype) {
        this.propertytype = propertytype;
    }

    public String getPropertyname() {
        return propertyname;
    }

    public void setPropertyname(String propertyname) {
        this.propertyname = propertyname;
    }

    public String getWantto() {
        return wantto;
    }

    public void setWantto(String wantto) {
        this.wantto = wantto;
    }

    public String getSelectcity() {
        return selectcity;
    }

    public void setSelectcity(String selectcity) {
        this.selectcity = selectcity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(String saleprice) {
        this.saleprice = saleprice;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Login getLid() {
        return lid;
    }

    public void setLid(Login lid) {
        this.lid = lid;
    }

    @XmlTransient
    public Collection<Buy> getBuyCollection() {
        return buyCollection;
    }

    public void setBuyCollection(Collection<Buy> buyCollection) {
        this.buyCollection = buyCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pid != null ? pid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Addproperty)) {
            return false;
        }
        Addproperty other = (Addproperty) object;
        if ((this.pid == null && other.pid != null) || (this.pid != null && !this.pid.equals(other.pid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Addproperty[ pid=" + pid + " ]";
    }
    
}
