package com.promt2app.distributed.account_service.service;


import com.promt2app.distributed.account_service.dto.subscription.CheckoutRequest;
import com.promt2app.distributed.account_service.dto.subscription.CheckoutResponse;
import com.promt2app.distributed.account_service.dto.subscription.PortalResponse;
import com.stripe.model.StripeObject;

import java.util.Map;

public interface PaymentProcessor {
  CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request);

  PortalResponse openCustomerResponse();

  void handleWebhookEvent(String type, StripeObject stripeObject, Map<String, String> metadata);
}
