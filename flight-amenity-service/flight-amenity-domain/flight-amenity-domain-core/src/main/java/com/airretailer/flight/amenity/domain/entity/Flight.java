package com.airretailer.flight.amenity.domain.entity;

import com.airretailer.flight.amenity.domain.valueobject.CabinType;
import com.airretailer.flight.amenity.domain.valueobject.CommonStatus;

public class Flight {

    private String id;
    private String flightNumber;
    private String airline;
    private String seats;
    private CabinType cabinType;
    private CommonStatus commonStatus;

    public Flight() {
    }

    public Flight(String id,
                  String flightNumber,
                  String airline,
                  String seats,
                  CabinType cabinType,
                  CommonStatus commonStatus) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.seats = seats;
        this.cabinType = cabinType;
        this.commonStatus = commonStatus;
    }

    private Flight(Builder builder) {
        id = builder.id;
        flightNumber = builder.flightNumber;
        airline = builder.airline;
        seats = builder.seats;
        cabinType = builder.cabinType;
        commonStatus = builder.commonStatus;
    }

    public static Builder builder() {
        return new Builder();
    }


    public static final class Builder {
        private String id;
        private String flightNumber;
        private String airline;
        private String seats;
        private CabinType cabinType;
        private CommonStatus commonStatus;

        private Builder() {
        }

        public Builder id(String val) {
            id = val;
            return this;
        }

        public Builder flightNumber(String val) {
            flightNumber = val;
            return this;
        }

        public Builder airline(String val) {
            airline = val;
            return this;
        }

        public Builder seats(String val) {
            seats = val;
            return this;
        }

        public Builder cabinType(CabinType val) {
            cabinType = val;
            return this;
        }

        public Builder commonStatus(CommonStatus val) {
            commonStatus = val;
            return this;
        }

        public Flight build() {
            return new Flight(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public String getSeats() {
        return seats;
    }

    public CabinType getCabinType() {
        return cabinType;
    }

    public CommonStatus getCommonStatus() {
        return commonStatus;
    }
}