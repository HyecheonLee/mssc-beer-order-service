package com.hyecheon.service.services;

import com.hyecheon.service.web.model.BeerOrderDto;
import com.hyecheon.service.web.model.BeerOrderPagedList;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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
