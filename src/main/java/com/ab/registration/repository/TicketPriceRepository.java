package com.ab.registration.repository;

import com.ab.registration.model.PricingCategory;
import com.ab.registration.model.TicketPrice;
import com.ab.registration.model.TicketType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TicketPriceRepository extends JpaRepository<TicketPrice, Integer> {

    @Query("from TicketPrice tp left join fetch tp.ticketType left join fetch tp.pricingCategory")
    List<TicketPrice> findAll();

    Optional<TicketPrice> findByTicketTypeAndPricingCategory(TicketType ticketType, PricingCategory pricingCategory);
}
