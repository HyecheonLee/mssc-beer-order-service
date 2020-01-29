package com.hyecheon.msscbeerorderservice.repositories;

import com.hyecheon.msscbeerorderservice.domain.BeerOrder;
import com.hyecheon.msscbeerorderservice.domain.Customer;
import com.hyecheon.msscbeerorderservice.domain.OrderStatusEnum;
import java.util.List;
import java.util.UUID;
import javax.persistence.LockModeType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

/**
 * @author hyecheon
 * @date 2020-01-29
 */
public interface BeerOrderRepository extends JpaRepository<BeerOrder, UUID> {

  Page<BeerOrder> findAllByCustomer(Customer customer, Pageable pageable);

  List<BeerOrder> findAllByOrderStatus(OrderStatusEnum orderStatusEnum);

  @Lock(LockModeType.PESSIMISTIC_WRITE)
  BeerOrder findOneById(UUID id);
}
