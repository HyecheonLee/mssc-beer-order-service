package com.hyecheon.service.web.mapper;

import com.hyecheon.service.domain.BeerOrderLine;
import com.hyecheon.service.services.beer.BeerService;
import com.hyecheon.service.web.model.BeerDto;
import com.hyecheon.service.web.model.BeerOrderLineDto;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author hyecheon
 * @date 2020-01-31
 */
public abstract class BeerOrderLineMapperDecorator implements BeerOrderLineMapper {

  private BeerService beerService;
  private BeerOrderLineMapper beerOrderLineMapper;

  @Autowired
  public void setBeerService(BeerService beerService) {
    this.beerService = beerService;
  }

  @Autowired
  @Qualifier("delegate")
  public void setBeerOrderLineMapper(
      BeerOrderLineMapper beerOrderLineMapper) {
    this.beerOrderLineMapper = beerOrderLineMapper;
  }

  @Override
  public BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line) {
    BeerOrderLineDto beerOrderLineDto = beerOrderLineMapper.beerOrderLineToDto(line);
    Optional<BeerDto> beerDtoOptional = beerService.getBeerByUpc(line.getUpc());
    beerDtoOptional.ifPresent(beerDto -> {
      beerOrderLineDto.setBeerName(beerDto.getBeerName());
      beerOrderLineDto.setBeerStyle(beerDto.getBeerStyle());
      beerOrderLineDto.setPrice(beerDto.getPrice());
      beerOrderLineDto.setBeerId(beerDto.getId());
    });
    return beerOrderLineDto;
  }

}
