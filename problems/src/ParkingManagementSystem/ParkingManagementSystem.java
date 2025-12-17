package ParkingManagementSystem;

import ParkingManagementSystem.Entity.ParkingLot.ParkingLot;
import ParkingManagementSystem.Entity.Ticket;
import ParkingManagementSystem.Entity.Vehicles.Vehicle;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class ParkingManagementSystem {
    ParkingManager parkingManager;
    FareCalculator fareCalculator;
    private static final AtomicInteger BASE_ID = new AtomicInteger(0);

    private static String generateID(){
        int id = BASE_ID.incrementAndGet();
        return "TICKET" + Integer.toBinaryString(id);
    }

    public ParkingManagementSystem(ParkingManager parkingManager, FareCalculator fareCalculator){
        this.fareCalculator = fareCalculator;
        this.parkingManager = parkingManager;
    }

    public Ticket parkVehicle(Vehicle vehicle){
        ParkingLot parkingLot = this.parkingManager.findSpotForVehicle(vehicle);
        Ticket ticket;
        if(parkingLot != null){
            ticket = new Ticket(generateID(), LocalDateTime.now(),vehicle,parkingLot);
            return ticket;
        }
        return null;
    }

    public double removeVehicle(Ticket ticket){
        double fare = 0.00;
        if(ticket != null){
            fare = fareCalculator.calculateFare(ticket);
            parkingManager.freeParkingLot(ticket.getVehicle());
        }
        return fare;
    }

}
