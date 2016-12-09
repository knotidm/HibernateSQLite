package org.model;

import javax.persistence.*;

/**
 * Created by Wojcimierz on 09.12.2016.
 */
@Entity
@Table(name = "invoices", schema = "", catalog = "")
public class InvoicesEntity {
    @Id
    private int invoiceId;
    private int customerId;
    private String invoiceDate;
    private String billingAddress;
    private String billingCity;
    private String billingState;
    private String billingCountry;
    private String billingPostalCode;
    private double total;

    @Basic
    @Column(name = "InvoiceId")
    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Basic
    @Column(name = "CustomerId")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "InvoiceDate")
    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    @Basic
    @Column(name = "BillingAddress")
    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    @Basic
    @Column(name = "BillingCity")
    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    @Basic
    @Column(name = "BillingState")
    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    @Basic
    @Column(name = "BillingCountry")
    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    @Basic
    @Column(name = "BillingPostalCode")
    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    public void setBillingPostalCode(String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    @Basic
    @Column(name = "Total")
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InvoicesEntity that = (InvoicesEntity) o;

        if (invoiceId != that.invoiceId) return false;
        if (customerId != that.customerId) return false;
        if (Double.compare(that.total, total) != 0) return false;
        if (invoiceDate != null ? !invoiceDate.equals(that.invoiceDate) : that.invoiceDate != null) return false;
        if (billingAddress != null ? !billingAddress.equals(that.billingAddress) : that.billingAddress != null)
            return false;
        if (billingCity != null ? !billingCity.equals(that.billingCity) : that.billingCity != null) return false;
        if (billingState != null ? !billingState.equals(that.billingState) : that.billingState != null) return false;
        if (billingCountry != null ? !billingCountry.equals(that.billingCountry) : that.billingCountry != null)
            return false;
        if (billingPostalCode != null ? !billingPostalCode.equals(that.billingPostalCode) : that.billingPostalCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = invoiceId;
        result = 31 * result + customerId;
        result = 31 * result + (invoiceDate != null ? invoiceDate.hashCode() : 0);
        result = 31 * result + (billingAddress != null ? billingAddress.hashCode() : 0);
        result = 31 * result + (billingCity != null ? billingCity.hashCode() : 0);
        result = 31 * result + (billingState != null ? billingState.hashCode() : 0);
        result = 31 * result + (billingCountry != null ? billingCountry.hashCode() : 0);
        result = 31 * result + (billingPostalCode != null ? billingPostalCode.hashCode() : 0);
        temp = Double.doubleToLongBits(total);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
