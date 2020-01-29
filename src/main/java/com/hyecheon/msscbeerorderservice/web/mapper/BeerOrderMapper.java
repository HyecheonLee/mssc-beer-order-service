package com.hyecheon.msscbeerorderservice.web.mapper;

import com.hyecheon.msscbeerorderservice.domain.BeerOrder;
import com.hyecheon.msscbeerorderservice.web.model.BeerOrderDto;
import org.mapstruct.Mapper;

/**
 * @author hyecheon
 * @date 2020-01-29
 */
@Mapper(uses = {DateMapper.class, BeerOrderLineMapper.class})
public interface BeerOrderMapper {

  BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

  BeerOrder dtoToBeerOrder(BeerOrderDto dto);
}
