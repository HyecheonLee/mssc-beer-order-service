package com.hyecheon.msscbeerorderservice.services;

import com.hyecheon.msscbeerorderservice.web.model.BeerOrderDto;
import com.hyecheon.msscbeerorderservice.web.model.BeerOrderPagedList;
import java.util.UUID;
import org.springframework.data.domain.Pageable;

/**
 * @author hyecheon
 * @date 2020-01-29
 */
public interface BeerOrderService {

  BeerOrderPagedList listOrders(UUID customerId, Pageable pageable);

  BeerOrderDto placeOrder(UUID customerId, BeerOrderDto beerOrderDto);

  BeerOrderDto getOrderById(UUID customerId, UUID orderId);

  void pickupOrder(UUID customerId, UUID orderId);
}
