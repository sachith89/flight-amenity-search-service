package com.airretailer.flight.amenity.application.service;

import com.airretailer.flight.amenity.domain.dto.CommonResponse;
import com.airretailer.flight.amenity.domain.entity.Flight;
import com.airretailer.flight.amenity.domain.valueobject.CabinType;
import org.springframework.stereotype.Service;

@Service
public class FlightAmenityServiceImpl implements com.airretailer.flight.amenity.domain.service.FlightAmenityService {
    @Override
    public CommonResponse createFlight(Flight flight) {
        return null;
    }

    @Override
    public CommonResponse updateFlight(Flight flight) {
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
