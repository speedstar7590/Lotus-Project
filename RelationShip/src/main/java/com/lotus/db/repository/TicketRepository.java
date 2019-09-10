package com.lotus.db.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lotus.db.entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

}