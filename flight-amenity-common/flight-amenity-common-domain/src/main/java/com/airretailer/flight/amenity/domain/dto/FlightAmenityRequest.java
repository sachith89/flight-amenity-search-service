package com.airretailer.flight.amenity.domain.dto;

import com.airretailer.flight.amenity.domain.valueobject.CabinType;
import com.airretailer.flight.amenity.domain.valueobject.CommonStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FlightAmenityRequest {
    private String id;
    private String flightNumber;
    private String airline;
    private String seats;
    private CabinType cabinType;
    private CommonStatus commonStatus;


}
