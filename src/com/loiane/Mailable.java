package com.loiane;

public sealed interface Mailable permits Product {

    double calculateShippingPrice();
}
