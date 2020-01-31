package com.hyecheon.service.web.mapper;

import com.hyecheon.service.domain.BeerOrderLine;
import com.hyecheon.service.web.model.BeerOrderLineDto;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

/**
 * @author hyecheon
 * @date 2020-01-29
 */
@Mapper(uses = {DateMapper.class})
@DecoratedWith(BeerOrderLineMapperDecorator.class)
public interface BeerOrderLineMapper {

  BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);


}
