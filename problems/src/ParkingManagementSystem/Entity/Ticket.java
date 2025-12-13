package ParkingManagementSystem.Entity;

import ParkingManagementSystem.Entity.ParkingLot.ParkingLot;
import ParkingManagementSystem.Entity.Vehicles.VehicleSize;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public class Ticket {
    String ticketId;
    LocalDateTime arrivalTime;
    LocalDateTime departureTime;
    VehicleSize vehicleSize;
    ParkingLot parkingLot;

    public Ticket(String ticketId, LocalDateTime arrivalTime, VehicleSize vehicleSize, ParkingLot parkingLot) {
        this.ticketId = ticketId;
        this.arrivalTime = arrivalTime;
        this.departureTime = null;
        this.vehicleSize = vehicleSize;
        this.parkingLot = parkingLot;
    }

    public long calculateParkingTime(){
        return Duration.between(arrivalTime, Objects.requireNonNullElseGet(departureTime, LocalDateTime::now)).toMinutes();
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public VehicleSize getVehicleSize() {
        return vehicleSize;
    }

    public void setVehicleSize(VehicleSize vehicleSize) {
        this.vehicleSize = vehicleSize;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
}
