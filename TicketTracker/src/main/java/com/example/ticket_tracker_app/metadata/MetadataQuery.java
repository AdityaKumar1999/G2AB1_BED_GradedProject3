package com.example.ticket_tracker_app.metadata;

public interface MetadataQuery {

	String GET_DATA_BY_NAME = "select * from TICKET_TRACKER where TICKET_SHORT_DESC like %?1% or TICKET_TITLE like %?1%";

}