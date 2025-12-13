package ParkingManagementSystem.Entity.Vehicles;

public class Truck implements Vehicle {
    private final String vehicleRegistration;
    public Truck(String vehicleRegistration){
        this.vehicleRegistration = vehicleRegistration;
    }
    @Override
    public VehicleSize getVehicleSize() {
        return VehicleSize.LARGE;
    }

    @Override
    public String getVehicleId() {
        return this.vehicleRegistration;
    }
}
