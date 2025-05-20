package org.example.services;

import org.example.models.ParkingSpot;
import org.example.models.VehicleType;
import org.example.repositories.ParkingSpotRepository;

public class SlotAllocationService {
    private ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

    public ParkingSpot findSpot(VehicleType vehicleType) {
        return parkingSpotRepository.findAvailableSlot(vehicleType);
    }

    public void allocateSpot(ParkingSpot parkingSpot) {
        parkingSpotRepository.useParkingSpot(parkingSpot);
    }
}
