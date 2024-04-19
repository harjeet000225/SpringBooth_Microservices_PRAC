package com.ibm.eventsourcing.eventsourcingdb;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

//This is table which stores events
@Data
@Entity
public class EventStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long eventId;
    private String eventType;
    private String entityId;
    private String eventData;
    private LocalDateTime eventTime;
}
