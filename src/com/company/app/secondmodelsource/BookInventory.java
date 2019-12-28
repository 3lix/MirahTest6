package com.company.app.secondmodelsource;

import java.util.List;

public class BookInventory implements IInventory<Offer, ItemPrice> {

    private List<Offer> offerReadDto;

    private ItemPrice priceDto;

    public BookInventory() {

    }

    public List<Offer> getOfferReadDto() {
        return offerReadDto;
    }

    public void setOfferReadDto(List<Offer> offerReadDto) {
        this.offerReadDto = offerReadDto;
    }

    public ItemPrice getPriceDto() {
        return priceDto;
    }

    public void setPriceDto(ItemPrice priceDto) {
        this.priceDto = priceDto;
    }

}
