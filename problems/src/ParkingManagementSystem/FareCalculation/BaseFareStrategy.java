package ParkingManagementSystem.FareCalculation;

import ParkingManagementSystem.Entity.Ticket;
import ParkingManagementSystem.Entity.Vehicles.VehicleSize;

public class BaseFareStrategy implements FareStrategy{
    double SMALL = 1.00;
    double MED = 1.50;
    double LARGE = 2.00;

    @Override
    public double calculateStrategy(Ticket ticket, double fare) {
        VehicleSize size = ticket.getVehicleSize();
        return switch (size) {
            case LARGE -> ticket.calculateParkingTime() * LARGE;
            case MEDIUM -> ticket.calculateParkingTime() * MED;
            case SMALL -> ticket.calculateParkingTime() * SMALL;
        };
    }
}
