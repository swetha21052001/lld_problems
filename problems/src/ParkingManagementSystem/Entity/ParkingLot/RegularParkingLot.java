package ParkingManagementSystem.Entity.ParkingLot;

import ParkingManagementSystem.Entity.Vehicles.Vehicle;
import ParkingManagementSystem.Entity.Vehicles.VehicleSize;

public class RegularParkingLot implements ParkingLot {

    private final int lotNumber;
    private Vehicle vehicle;

    public RegularParkingLot(int lotNumber){
        this.lotNumber = lotNumber;
        this.vehicle = null;
    }

    @Override
    public synchronized boolean isAvailable() {
        return this.vehicle == null;
    }

    @Override
    public synchronized void occupy(Vehicle v) {
        if (isAvailable()) {
            this.vehicle = v;
        }else{
            System.out.println(this.lotNumber + " not available");
        }
    }

    @Override
    public synchronized void vacate() {
        this.vehicle = null;
    }

    @Override
    public int getId() {
        return this.lotNumber;
    }

    @Override
    public VehicleSize getVehicleSize() {
        return VehicleSize.MEDIUM;
    }
}
