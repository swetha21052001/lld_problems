package ParkingManagementSystem;

import ParkingManagementSystem.Entity.ParkingLot.ParkingLot;
import ParkingManagementSystem.Entity.Ticket;
import ParkingManagementSystem.Entity.Vehicles.Vehicle;
import ParkingManagementSystem.Entity.Vehicles.VehicleSize;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingManager {
    Map<VehicleSize, List<ParkingLot>> availableLots;
    Map<Vehicle, ParkingLot> parkedVehicles;

    public ParkingManager(Map<VehicleSize, List<ParkingLot>> parkingLots){
        this.availableLots = parkingLots;
        this.parkedVehicles = new HashMap<>();
    }

    public ParkingLot findSpotForVehicle(Vehicle vehicle){
        VehicleSize size = vehicle.getVehicleSize();
        for(VehicleSize avSize: availableLots.keySet()){
            if(avSize.ordinal() >= size.ordinal()){
                for(ParkingLot parkingLot : availableLots.get(avSize)){
                    if (parkingLot.isAvailable()){
                        parkingLot.occupy(vehicle);
                        parkedVehicles.put(vehicle, parkingLot);
                        availableLots.get(size).remove(parkingLot);
                        return parkingLot;
                    }
                }
            }
        }
        return null;
    }

    public void unparkVehicle(Vehicle vehicle){
        ParkingLot parkingLot = parkedVehicles.remove(vehicle);
        availableLots.get(parkingLot.getVehicleSize()).add(parkingLot);
        parkingLot.vacate();
    }
}
