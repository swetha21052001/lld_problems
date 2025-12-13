package ParkingManagementSystem.Entity.Vehicles;

public class Car implements Vehicle {
    private final String vehicleRegistration;
    public Car(String vehicleRegistration){
        this.vehicleRegistration = vehicleRegistration;
    }
    @Override
    public VehicleSize getVehicleSize() {
        return VehicleSize.MEDIUM;
    }

    @Override
    public String getVehicleId() {
        return vehicleRegistration;
    }
}
