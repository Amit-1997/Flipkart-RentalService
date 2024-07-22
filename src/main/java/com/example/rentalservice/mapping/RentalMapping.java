package com.example.rentalservice.mapping;


import com.example.rentalservice.pojo.Branch;
import com.example.rentalservice.pojo.Vehicle;
import com.example.rentalservice.serviceImpl.RentalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RentalMapping {
    @Autowired
    private RentalServiceImpl rentalService;


    @GetMapping("/vehicles")
    public List<Vehicle> getAllVehicle()
    {
        return rentalService.getAllVehicle();
    }

    @PostMapping("/onboardvehicle")
    public String onboardVehicle(@RequestBody Vehicle vehicle)
    {

         rentalService.newVehicle(vehicle);
        return "Vehicle onboarded";
    }

    @PostMapping("/onboard")
    public String onboardBranch(@RequestBody Branch branch)
    {
        rentalService.onboardNewBranch(branch);
        return "New Branch Created";
    }

    @GetMapping("/branch/{branchName}")
    public List<Branch> getBranch(@PathVariable String branchName)
    {
        return rentalService.onboarded(branchName);
    }

}
