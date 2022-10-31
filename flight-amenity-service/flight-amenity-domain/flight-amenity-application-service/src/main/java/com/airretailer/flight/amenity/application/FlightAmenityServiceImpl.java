package com.airretailer.flight.amenity.application;

import com.airretailer.flight.amenity.domain.dto.FlightAmenityRequest;
import com.airretailer.flight.amenity.application.service.FlightAmenityService;
import com.airretailer.flight.amenity.domain.dto.CommonResponse;
import com.airretailer.flight.amenity.domain.entity.Flight;
import com.airretailer.flight.amenity.domain.valueobject.CabinType;
import org.springframework.stereotype.Service;

@Service
public class FlightAmenityServiceImpl implements FlightAmenityService {
    @Override
    public CommonResponse createFlight(FlightAmenityRequest flight) {
        return null;
    }

    @Override
    public CommonResponse updateFlight(FlightAmenityRequest flight) {
        return null;
    }

    @Override
    public CommonResponse deleteFlight(String flightId) {
        return null;
    }

    @Override
    public CommonResponse getFlightById(String flightId) {
        return null;
    }

    @Override
    public CommonResponse getFlightByNumber(String flightName) {
        return null;
    }

    @Override
    public CommonResponse getAllFlight(int page, int size) {
        return null;
    }

    @Override
    public Flight getFlightByFlightAndCabinType(String flightNumber, CabinType cabinType) {
        return null;
    }
}
