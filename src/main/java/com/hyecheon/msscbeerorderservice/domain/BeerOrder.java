package com.hyecheon.msscbeerorderservice.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * @author hyecheon
 * @date 2020-01-29
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BeerOrder extends BaseEntity {

  @Builder
  public BeerOrder(UUID id, Long version, Timestamp createdDate, Timestamp lastModifiedDate,
      String customerRef, Customer customer,
      Set<BeerOrderLine> beerOrderLines, OrderStatusEnum orderStatus,
      String orderStatusCallbackUrl) {
    super(id, version, createdDate, lastModifiedDate);
    this.customerRef = customerRef;
    this.customer = customer;
    this.beerOrderLines = beerOrderLines;
    this.orderStatus = orderStatus;
    this.orderStatusCallbackUrl = orderStatusCallbackUrl;
  }

  private String customerRef;

  @ManyToOne
  private Customer customer;

  @OneToMany(mappedBy = "beerOrder", cascade = CascadeType.ALL)
  @Fetch(FetchMode.JOIN)
  private Set<BeerOrderLine> beerOrderLines = new HashSet<>();

  private OrderStatusEnum orderStatus = OrderStatusEnum.NEW;
  private String orderStatusCallbackUrl;
}
