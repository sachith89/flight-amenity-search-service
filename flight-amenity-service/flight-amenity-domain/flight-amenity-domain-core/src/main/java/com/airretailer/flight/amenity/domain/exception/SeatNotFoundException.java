package com.airretailer.flight.amenity.domain.exception;

public class SeatNotFoundException extends DomainException{
    public SeatNotFoundException(String message) {
        super(message);
    }

    public SeatNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
