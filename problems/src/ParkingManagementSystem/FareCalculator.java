package ParkingManagementSystem;

import ParkingManagementSystem.Entity.Ticket;
import ParkingManagementSystem.FareCalculation.FareStrategy;

import java.util.List;

public class FareCalculator {
    List<FareStrategy> fareStrategies;

    public FareCalculator(List<FareStrategy> fareStrategies){
        this.fareStrategies = fareStrategies;
    }

    public double calculateFare(Ticket ticket){
        double fare = 0.00;
        for (FareStrategy strategy: fareStrategies){
            fare = strategy.calculateStrategy(ticket, fare);
        }
        return fare;
    }
}
