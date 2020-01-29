package com.hyecheon.msscbeerorderservice.web.model;

import com.hyecheon.msscbeerorderservice.domain.OrderStatusEnum;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author hyecheon
 * @date 2020-01-29
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BeerOrderDto extends BaseItem {

  @Builder
  public BeerOrderDto(UUID id, Integer version, OffsetDateTime createdDate,
      OffsetDateTime lastModifiedDate, UUID customerId, List<BeerOrderLineDto> beerOrderLines,
      OrderStatusEnum orderStatus, String orderStatusCallbackUrl, String customerRef) {
    super(id, version, createdDate, lastModifiedDate);
    this.customerId = customerId;
    this.beerOrderLines = beerOrderLines;
    this.orderStatus = orderStatus;
    this.orderStatusCallbackUrl = orderStatusCallbackUrl;
    this.customerRef = customerRef;
  }

  private UUID customerId;
  private String customerRef;
  private List<BeerOrderLineDto> beerOrderLines;
  private OrderStatusEnum orderStatus;
  private String orderStatusCallbackUrl;
}
