package com.yh.push.domain.customer.gateway;

import com.yh.push.domain.customer.Credit;

//Assume that the credit info is in another distributed Service
public interface CreditGateway {
    Credit getCredit(String customerId);
}
