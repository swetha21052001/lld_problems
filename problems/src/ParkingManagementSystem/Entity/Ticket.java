package ParkingManagementSystem.Entity;

import ParkingManagementSystem.Entity.ParkingLot.ParkingLot;
import ParkingManagementSystem.Entity.Vehicles.Vehicle;
import ParkingManagementSystem.Entity.Vehicles.VehicleSize;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public class Ticket {
    String ticketId;
    LocalDateTime arrivalTime;
    LocalDateTime departureTime;
    Vehicle vehicle;
    ParkingLot parkingLot;

    public Ticket(String ticketId, LocalDateTime arrivalTime, Vehicle vehicle, ParkingLot parkingLot) {
        this.ticketId = ticketId;
        this.arrivalTime = arrivalTime;
        this.departureTime = null;
        this.vehicle = vehicle;
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

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicleSize(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
}
