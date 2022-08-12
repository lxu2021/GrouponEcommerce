package com.Laresx.ecomApp.services;

import com.Laresx.ecomApp.dto.PaymentInfo;
import com.Laresx.ecomApp.dto.Purchase;
import com.Laresx.ecomApp.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
