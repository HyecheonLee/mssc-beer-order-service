package com.hyecheon.service.services;

import com.hyecheon.service.web.model.BeerOrderDto;
import com.hyecheon.service.web.model.BeerOrderPagedList;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author hyecheon
 * @date 2020-01-31
 */
@RequiredArgsConstructor
@ConfigurationProperties(prefix = "sfg.brewery", ignoreUnknownFields = false)
@Service
public class BeerOrderServiceImpl implements BeerOrderService {

  public final String BEER_PATH_V1 = "/api/v1/beer/";
  public final String BEER_UPC_PATH = "/api/v1/beerUpc/";
  @Setter
  private String beerServiceHost;

  @Override
  public BeerOrderPagedList listOrders(UUID customerId, Pageable pageable) {
    return null;
  }

  @Override
  public BeerOrderDto placeOrder(UUID customerId, BeerOrderDto beerOrderDto) {
    return null;
  }

  @Override
  public BeerOrderDto getOrderById(UUID customerId, UUID orderId) {
    return null;
  }

  @Override
  public void pickupOrder(UUID customerId, UUID orderId) {

  }
}
