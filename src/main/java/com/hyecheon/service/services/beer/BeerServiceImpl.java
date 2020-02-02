package com.hyecheon.service.services.beer;

import com.hyecheon.service.web.model.BeerDto;
import java.util.Optional;
import java.util.UUID;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author hyecheon
 * @date 2020-01-31
 */
@ConfigurationProperties(prefix = "sfg.brewery", ignoreUnknownFields = false)
@Service
public class BeerServiceImpl implements BeerService {

  public final String BEER_PATH_V1 = "/api/v1/beer/";
  public final String BEER_UPC_PATH = "/api/v1/beerUpc/";
  private final RestTemplate restTemplate;
  @Setter
  private String beerServiceHost;

  public BeerServiceImpl(RestTemplateBuilder restTemplate) {
    this.restTemplate = restTemplate.build();
  }

  @Override
  public Optional<BeerDto> getBeerById(UUID uuid) {
    return Optional.ofNullable(restTemplate
        .getForObject(beerServiceHost + BEER_PATH_V1 + uuid.toString(), BeerDto.class));
  }

  @Override
  public Optional<BeerDto> getBeerByUpc(String upc) {
    return Optional.ofNullable(restTemplate
        .getForObject(beerServiceHost + BEER_UPC_PATH + upc, BeerDto.class));
  }
}
