DROP SCHEMA IF EXISTS "flight_amenity" CASCADE;

CREATE SCHEMA "flight_amenity";

DROP TABLE IF EXISTS "flight_amenity".tbl_ar_flight_amenity CASCADE;

CREATE TABLE "flight_amenity".tbl_ar_flight_amenity
(
    id uuid NOT NULL,
    flight_number varchar(100) NULL,
    airline varchar(100) NULL,
    seats int NULL,
    cabin_type varchar(100) NOT NULL
);