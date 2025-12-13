package ParkingManagementSystem.Entity.Vehicles;

public class MotorCycle implements Vehicle {
    private final String vehicleRegistration;
    public MotorCycle(String vehicleRegistration){
        this.vehicleRegistration = vehicleRegistration;
    }
    @Override
    public VehicleSize getVehicleSize() {
        return VehicleSize.SMALL;
    }

    @Override
    public String getVehicleId() {
        return this.vehicleRegistration;
    }
}
