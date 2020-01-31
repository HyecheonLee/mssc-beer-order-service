package com.hyecheon.service.services.beer;

import com.hyecheon.service.web.model.BeerDto;
import java.util.Optional;
import java.util.UUID;

/**
 * @author hyecheon
 * @date 2020-01-31
 */
public interface BeerService {

  Optional<BeerDto> getBeerById(UUID uuid);

  Optional<BeerDto> getBeerByUpc(String upc);
}