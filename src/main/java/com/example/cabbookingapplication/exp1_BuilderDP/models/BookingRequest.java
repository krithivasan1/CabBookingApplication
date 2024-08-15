package com.example.cabbookingapplication.exp1_BuilderDP.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;


public class BookingRequest {
    public String source;
    public String destination;
    public String cabType;
    public String specialInstructions;
    public double distance;
    public double amount;

    private BookingRequest(BookingRequestBuilder builder) {
        this.source = builder.source;
        this.destination = builder.destination;
        this.amount=builder.amount;
        this.distance = builder.distance;
        this.cabType=builder.cabType;
        this.specialInstructions=builder.specialInstructions;
    }

    public static BookingRequestBuilder getBuilder() {
        return new BookingRequestBuilder();
    }


    public static class BookingRequestBuilder {
        public String source;
        public String destination;
        public String cabType;
        public String specialInstructions;

        public String getSource() {
            return source;
        }

        public String getDestination() {
            return destination;
        }

        public String getCabType() {
            return cabType;
        }

        public String getSpecialInstructions() {
            return specialInstructions;
        }

        public double getDistance() {
            return distance;
        }

        public double getAmount() {
            return amount;
        }

        public double distance;
        public double amount;

        public BookingRequestBuilder setSource(String source) {
            this.source = source;
            return this;
        }

        public BookingRequestBuilder setDestination(String destination) {
            this.destination = destination;
            return this;
        }

        public BookingRequestBuilder setCabType(String cabType) {
            this.cabType = cabType;
            return this;

        }

        public BookingRequestBuilder setSpecialInstructions(String specialInstructions) {
            this.specialInstructions = specialInstructions;
            return this;

        }

        public BookingRequestBuilder setAmount(double amount) {
            this.amount = amount;
            return this;

        }

        public BookingRequestBuilder setDistance(double distance) {
            this.distance = distance;
            return this;

        }

        public BookingRequest build() {
            if (this.getSource() == null) {
                throw new RuntimeException("Source  is mandatory");

            }
            if (!this.getSource().contains("Chennai")) {
                throw new RuntimeException("Source  is available only in Chennai");

            }
            if (this.getDestination() == null) {
                throw new RuntimeException("Destination  is mandatory");

            }

            if (!this.getDestination().contains("Chennai")) {
                throw new RuntimeException("Destination is available only in Chennai");

            }


            return new BookingRequest(this);
        }

    }
}
