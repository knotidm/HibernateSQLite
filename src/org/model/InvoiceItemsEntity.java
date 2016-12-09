package org.model;

import javax.persistence.*;

/**
 * Created by Wojcimierz on 09.12.2016.
 */
@Entity
@Table(name = "invoice_items", schema = "", catalog = "")
public class InvoiceItemsEntity {
    @Id
    private int invoiceLineId;
    private int invoiceId;
    private int trackId;
    private double unitPrice;
    private int quantity;

    @Basic
    @Column(name = "InvoiceLineId")
    public int getInvoiceLineId() {
        return invoiceLineId;
    }

    public void setInvoiceLineId(int invoiceLineId) {
        this.invoiceLineId = invoiceLineId;
    }

    @Basic
    @Column(name = "InvoiceId")
    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Basic
    @Column(name = "TrackId")
    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    @Basic
    @Column(name = "UnitPrice")
    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "Quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InvoiceItemsEntity that = (InvoiceItemsEntity) o;

        if (invoiceLineId != that.invoiceLineId) return false;
        if (invoiceId != that.invoiceId) return false;
        if (trackId != that.trackId) return false;
        if (Double.compare(that.unitPrice, unitPrice) != 0) return false;
        if (quantity != that.quantity) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = invoiceLineId;
        result = 31 * result + invoiceId;
        result = 31 * result + trackId;
        temp = Double.doubleToLongBits(unitPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + quantity;
        return result;
    }
}
