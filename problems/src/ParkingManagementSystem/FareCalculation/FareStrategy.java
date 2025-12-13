package ParkingManagementSystem.FareCalculation;

import ParkingManagementSystem.Entity.Ticket;

import java.math.BigDecimal;

public interface FareStrategy {
    double calculateStrategy(Ticket ticket, double fare);
}
