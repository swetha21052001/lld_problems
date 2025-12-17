package ParkingManagementSystem;

import ParkingManagementSystem.Entity.ParkingLot.CompactParkingLot;
import ParkingManagementSystem.Entity.ParkingLot.OversizedParkingLot;
import ParkingManagementSystem.Entity.ParkingLot.RegularParkingLot;
import ParkingManagementSystem.Entity.ParkingLot.ParkingLot;
import ParkingManagementSystem.Entity.Vehicles.*;
import ParkingManagementSystem.FareCalculation.BaseFareStrategy;
import ParkingManagementSystem.FareCalculation.PeakHourFareStrategy;
import ParkingManagementSystem.FareCalculation.FareStrategy;
import ParkingManagementSystem.Entity.Ticket;

import java.util.*;

public class ParkingManagementExecution {
    public static void main(String[] args){
        Map<VehicleSize, List<ParkingLot>> map = new HashMap<>();
        map.put(VehicleSize.SMALL, new ArrayList<>());
        map.put(VehicleSize.MEDIUM, new ArrayList<>());
        map.put(VehicleSize.LARGE, new ArrayList<>());

        // create parking lots
        map.get(VehicleSize.SMALL).add(new CompactParkingLot(1));
        map.get(VehicleSize.MEDIUM).add(new RegularParkingLot(2));
        map.get(VehicleSize.MEDIUM).add(new RegularParkingLot(3));
        map.get(VehicleSize.LARGE).add(new OversizedParkingLot(4));

        ParkingManager manager = new ParkingManager(map);
        List<FareStrategy> strategies = Arrays.asList(new BaseFareStrategy(), new PeakHourFareStrategy());
        FareCalculator fareCalculator = new FareCalculator(strategies);
        ParkingManagementSystem system = new ParkingManagementSystem(manager, fareCalculator);

        Runnable task1 = () -> {
            try {
                Vehicle v1 = new Car("CAR-1");
                Ticket t1 = system.parkVehicle(v1);
                System.out.println(Thread.currentThread().getName() + " parked: " + (t1 != null ? t1.getTicketId() : "failed"));
                Thread.sleep(200);
                double fare = system.removeVehicle(t1);
                System.out.println(Thread.currentThread().getName() + " removed fare: " + fare);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Runnable task2 = () -> {
            try {
                Vehicle v2 = new MotorCycle("MOTO-1");
                Ticket t2 = system.parkVehicle(v2);
                System.out.println(Thread.currentThread().getName() + " parked: " + (t2 != null ? t2.getTicketId() : "failed"));
                Thread.sleep(100);
                Vehicle v3 = new Truck("TRUCK-1");
                Ticket t3 = system.parkVehicle(v3);
                System.out.println(Thread.currentThread().getName() + " parked: " + (t3 != null ? t3.getTicketId() : "failed"));
                Thread.sleep(300);
                if (t2 != null) {
                    double fare2 = system.removeVehicle(t2);
                    System.out.println(Thread.currentThread().getName() + " removed fare: " + fare2);
                }
                if (t3 != null) {
                    double fare3 = system.removeVehicle(t3);
                    System.out.println(Thread.currentThread().getName() + " removed fare: " + fare3);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Thread thread1 = new Thread(task1, "Thread-1");
        Thread thread2 = new Thread(task2, "Thread-2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Execution finished");
    }
}
