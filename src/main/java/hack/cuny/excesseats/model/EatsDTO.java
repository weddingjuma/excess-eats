package hack.cuny.excesseats.model;

import java.util.Date;

public class EatsDTO {
    private long id;
    private String description;
    private String producer;
    private long producerId;
    private boolean expired;
    private Date expires;
    private double price;
    private double discount;
    private double discountedPrice;

    public EatsDTO(Eats eats) {
        id = eats.getId();
        producer = eats.getProducer().getName();
        description = eats.getDescription();
        expired = eats.isExpired();
        expires = eats.getExpires();
        price = eats.getPrice();
        discount = eats.getDiscount();
        discountedPrice = eats.getPrice()*eats.getDiscount();
        producerId = eats.getProducer().getId();
    }

    public EatsDTO() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public Date getExpires() {
        return expires;
    }

    public void setExpires(Date expires) {
        this.expires = expires;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public long getProducerId() {
        return producerId;
    }

    public void setProducerId(long producerId) {
        this.producerId = producerId;
    }

    @Override
    public String toString() {
        return "EatsDTO{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", producer='" + producer + '\'' +
                ", producerId=" + producerId +
                ", expired=" + expired +
                ", expires=" + expires +
                ", price=" + price +
                ", discount=" + discount +
                ", discountedPrice=" + discountedPrice +
                '}';
    }
}
