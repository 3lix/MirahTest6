package com.company.app.secondmodelsource;

public class ServicePrice implements IPrice {

    private long productPriceInCents;

    public ServicePrice() {

    }

    public long getProductPriceInCents() {
        return productPriceInCents;
    }

    public void setProductPriceInCents(long productPriceInCents) {
        this.productPriceInCents = productPriceInCents;
    }

}
