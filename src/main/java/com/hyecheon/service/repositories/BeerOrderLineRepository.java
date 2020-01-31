package com.hyecheon.service.repositories;

import com.hyecheon.service.domain.BeerOrderLine;
import java.util.UUID;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author hyecheon
 * @date 2020-01-29
 */
public interface BeerOrderLineRepository extends PagingAndSortingRepository<BeerOrderLine, UUID> {

}
