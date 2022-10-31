package com.airretailer.flight.amenity.application.service;

import com.airretailer.flight.amenity.domain.dto.FlightAmenityRequest;
import com.airretailer.flight.amenity.domain.dto.CommonResponse;
import com.airretailer.flight.amenity.domain.entity.Flight;
import com.airretailer.flight.amenity.domain.valueobject.CabinType;

public interface FlightAmenityService {

        CommonResponse createFlight(FlightAmenityRequest flight);

        CommonResponse updateFlight(FlightAmenityRequest flight);

        CommonResponse deleteFlight(String flightId);

        CommonResponse getFlightById(String flightId);

        CommonResponse getFlightByNumber(String flightName);

        CommonResponse getAllFlight(int page, int size);

        Flight getFlightByFlightAndCabinType(String flightNumber, CabinType cabinType);



}
