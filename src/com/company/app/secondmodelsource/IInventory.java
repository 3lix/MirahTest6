package com.company.app.secondmodelsource;

import java.util.List;

public interface IInventory<O extends IOffer, P extends IPrice> {

    List<O> getOfferReadDto();

    void setOfferReadDto(List<O> offers);

    P getPriceDto();

    void setPriceDto(P price);

}
