package com.yh.push.domain.customer.gateway;

import com.yh.push.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
