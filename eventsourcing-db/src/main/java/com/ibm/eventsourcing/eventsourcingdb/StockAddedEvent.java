package com.ibm.eventsourcing.eventsourcingdb;

import com.ibm.eventsourcing.eventsourcingdb.Stock;
import com.ibm.eventsourcing.eventsourcingdb.StockEvent;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StockAddedEvent implements StockEvent {
    private Stock stockDetails;
}