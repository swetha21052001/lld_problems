package ParkingManagementSystem.FareCalculation;

import ParkingManagementSystem.Entity.Ticket;
import ParkingManagementSystem.Entity.Vehicles.VehicleSize;

import java.time.LocalDateTime;

public class PeakHourFareStrategy implements FareStrategy{

    @Override
    public double calculateStrategy(Ticket ticket, double fare) {
        VehicleSize size = ticket.getVehicle().getVehicleSize();
        if (isPeakHours(ticket.getArrivalTime())){
            fare *= 1.5;
        }
        return fare;
    }

    private boolean isPeakHours(LocalDateTime time) {
        int hour = time.getHour();
        return (hour >= 7 && hour <= 10) || (hour >= 16 && hour <= 19);
    }

}
