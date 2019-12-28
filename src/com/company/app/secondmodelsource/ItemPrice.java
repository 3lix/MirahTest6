
package com.company.app.secondmodelsource;


public class ItemPrice implements IPrice {

    private long productPriceInCents;

    public ItemPrice() {

    }

    public long getProductPriceInCents() {
        return productPriceInCents;
    }

    public void setProductPriceInCents(long productPriceInCents) {
        this.productPriceInCents = productPriceInCents;
    }

}
