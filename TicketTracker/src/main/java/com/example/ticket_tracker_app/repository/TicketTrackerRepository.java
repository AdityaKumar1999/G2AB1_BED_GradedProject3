package com.example.ticket_tracker_app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ticket_tracker_app.metadata.MetadataQuery;
import com.example.ticket_tracker_app.model.TicketTracker;

@Repository
public interface TicketTrackerRepository extends JpaRepository<TicketTracker, Long> {

	@Query(value = MetadataQuery.GET_DATA_BY_NAME, nativeQuery = true)
	List<TicketTracker> getTicketByName(String keyword);
}
