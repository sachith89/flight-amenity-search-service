package com.airretailer.flight.amenity.exception.handler;


import com.airretailer.flight.amenity.application.handler.ErrorDTO;
import com.airretailer.flight.amenity.application.handler.GlobalExceptionHandler;
import com.airretailer.flight.amenity.domain.exception.FlightAmenityDomainException;
import com.airretailer.flight.amenity.domain.exception.SeatNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@ControllerAdvice
public class FlightAmenityGlobalExceptionHandler extends GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = {FlightAmenityDomainException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDTO handleException(FlightAmenityDomainException flightAmenityDomainException) {
        log.error(flightAmenityDomainException.getMessage(), flightAmenityDomainException);
        return ErrorDTO.builder()
                .code(HttpStatus.BAD_REQUEST.getReasonPhrase())
                .message(flightAmenityDomainException.getMessage())
                .build();
    }

    @ResponseBody
    @ExceptionHandler(value = {SeatNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorDTO handleException(SeatNotFoundException seatNotFoundException) {
        log.error(seatNotFoundException.getMessage(), seatNotFoundException);
        return ErrorDTO.builder()
                .code(HttpStatus.NOT_FOUND.getReasonPhrase())
                .message(seatNotFoundException.getMessage())
                .build();
    }
}
