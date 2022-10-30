package com.airretailer.flight.amenity.domain.exception;

public class FlightNotFoundException extends DomainException {
    public FlightNotFoundException(String message) {
        super(message);
    }

    public FlightNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
