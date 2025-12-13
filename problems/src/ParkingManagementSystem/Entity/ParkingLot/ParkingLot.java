package ParkingManagementSystem.Entity.ParkingLot;

import ParkingManagementSystem.Entity.Vehicles.Vehicle;
import ParkingManagementSystem.Entity.Vehicles.VehicleSize;

public interface ParkingLot {
    boolean isAvailable();
    void occupy(Vehicle v);
    void vacate();
    int getId();
    VehicleSize getVehicleSize();
}
