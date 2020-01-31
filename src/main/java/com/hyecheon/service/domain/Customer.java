package com.hyecheon.service.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author hyecheon
 * @date 2020-01-29
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class Customer extends BaseEntity {

  @Builder
  public Customer(UUID id, Long version, Timestamp createdDate, Timestamp lastModifiedDate,
      String customerName,
      UUID apiKey, Set<BeerOrder> beerOrders) {
    super(id, version, createdDate, lastModifiedDate);
    this.customerName = customerName;
    this.apiKey = apiKey;
    this.beerOrders = beerOrders;
  }

  private String customerName;

  @Column(length = 36, columnDefinition = "varchar")
  private UUID apiKey;

  @OneToMany(mappedBy = "customer")
  private Set<BeerOrder> beerOrders = new HashSet<>();

}
