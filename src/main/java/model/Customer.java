package model;

import java.sql.Timestamp;
import java.util.List;

public class Customer extends User {
    private int addressColumn;
    private Timestamp create_Date;
    private List<Payment> payments;
    private List<Rental> rentals;


    public int getAddressColumn() {
        return addressColumn;
    }

    public void setAddressColumn(int addressColumn) {
        this.addressColumn = addressColumn;
    }

    public Timestamp getCreate_Date() {
        return create_Date;
    }

    public void setCreate_Date(Timestamp create_Date) {
        this.create_Date = create_Date;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }
}
