package ParkingManagementSystem;

import ParkingManagementSystem.Entity.ParkingLot.ParkingLot;
import ParkingManagementSystem.Entity.Ticket;
import ParkingManagementSystem.Entity.Vehicles.Vehicle;
import ParkingManagementSystem.Entity.Vehicles.VehicleSize;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingManager {
    private final Map<VehicleSize, List<ParkingLot>> availableLots;
    private final Map<Vehicle, ParkingLot> parkedVehicles;

    public ParkingManager(Map<VehicleSize, List<ParkingLot>> parkingLots){
        this.availableLots = parkingLots;
        this.parkedVehicles = new HashMap<>();
    }

    public synchronized ParkingLot findSpotForVehicle(Vehicle vehicle){
        VehicleSize size = vehicle.getVehicleSize();
        for(VehicleSize avSize: availableLots.keySet()){
            if(avSize.ordinal() >= size.ordinal()){
                List<ParkingLot> lots = availableLots.get(avSize);
                for(ParkingLot parkingLot : lots){
                    if (parkingLot.isAvailable()){
                        parkingLot.occupy(vehicle);
                        parkedVehicles.put(vehicle, parkingLot);
                        // remove from the list we iterated over
                        lots.remove(parkingLot);
                        return parkingLot;
                    }
                }
            }
        }
        return null;
    }

    public synchronized void freeParkingLot (Vehicle vehicle){
        ParkingLot parkingLot = parkedVehicles.remove(vehicle);
        if (parkingLot != null) {
            availableLots.get(parkingLot.getVehicleSize()).add(parkingLot);
            parkingLot.vacate();
        }
    }
}
