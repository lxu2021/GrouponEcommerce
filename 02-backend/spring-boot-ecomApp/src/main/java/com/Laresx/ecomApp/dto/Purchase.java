package com.Laresx.ecomApp.dto;

import com.Laresx.ecomApp.entity.Address;
import com.Laresx.ecomApp.entity.Customer;
import com.Laresx.ecomApp.entity.Order;
import com.Laresx.ecomApp.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
