package com.example.rentalservice.service;

import com.example.rentalservice.pojo.Branch;
import com.example.rentalservice.pojo.Vehicle;

import java.util.List;
import java.util.Optional;

public interface RentalService {

    public boolean newVehicle(Vehicle vehicle);
    public List<Vehicle> getAllVehicle();
    Branch onboardNewBranch(Branch branch);
    List<Branch> onboarded(String BranchName);


}
