package com.hyecheon.service.web.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author hyecheon
 * @date 2020-01-29
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class BeerOrderLineDto extends BaseItem {

  @Builder
  public BeerOrderLineDto(UUID id, Integer version, OffsetDateTime createdDate,
      OffsetDateTime lastModifiedDate,
      String upc, String beerName, UUID beerId, Integer orderQuantity) {
    super(id, version, createdDate, lastModifiedDate);
    this.upc = upc;
    this.beerName = beerName;
    this.beerId = beerId;
    this.orderQuantity = orderQuantity;
  }

  private String upc;
  private String beerName;
  private String beerStyle;
  private UUID beerId;
  private Integer orderQuantity = 0;
  private BigDecimal price;

  private Integer quantityAllocated;
}
