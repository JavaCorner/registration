package com.ab.registration.repository;

import com.ab.registration.model.TicketType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TicketTypeRepository extends JpaRepository<TicketType, String> {

    Optional<TicketType> findByCode(String code);
}
