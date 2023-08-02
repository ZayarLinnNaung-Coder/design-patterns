package org.example;

public class Cart {
    private Integer id;
    private Double amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }
}
