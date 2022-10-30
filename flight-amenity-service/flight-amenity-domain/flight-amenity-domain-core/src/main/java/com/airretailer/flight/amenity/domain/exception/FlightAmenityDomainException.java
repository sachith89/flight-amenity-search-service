package com.airretailer.flight.amenity.domain.exception;

public class FlightAmenityDomainException extends DomainException{
    public FlightAmenityDomainException(String message) {
        super(message);
    }

    public FlightAmenityDomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
