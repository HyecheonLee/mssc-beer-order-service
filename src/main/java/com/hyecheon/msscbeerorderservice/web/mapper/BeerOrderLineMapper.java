package com.hyecheon.msscbeerorderservice.web.mapper;

import com.hyecheon.msscbeerorderservice.domain.BeerOrderLine;
import com.hyecheon.msscbeerorderservice.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

/**
 * @author hyecheon
 * @date 2020-01-29
 */
@Mapper(uses = {DateMapper.class})
public interface BeerOrderLineMapper {

  BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

  BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}
