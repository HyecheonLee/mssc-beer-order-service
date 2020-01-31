package com.hyecheon.service.web.mapper;

import com.hyecheon.service.domain.BeerOrder;
import com.hyecheon.service.web.model.BeerOrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author hyecheon
 * @date 2020-01-29
 */
@Mapper(uses = {DateMapper.class, BeerOrderLineMapper.class})
public interface BeerOrderMapper {

  @Mapping(target = "customerId", source = "customer.id")
  BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

  BeerOrder dtoToBeerOrder(BeerOrderDto dto);
}
