package com.example.rentalservice.serviceImpl;

import com.example.rentalservice.pojo.Branch;
import com.example.rentalservice.pojo.Vehicle;
import com.example.rentalservice.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RentalServiceImpl implements RentalService {

    @Autowired
    private Branch branch;
    static  List<Vehicle> vehicles=new ArrayList<>();
    static  List<Branch> branches=new ArrayList<>();

    static {

       // vehicles.add(new Vehicle("Honda", "CBR","Bike","650", "2015", true, "Waidhan") );
       // vehicles.add(new Vehicle("Kawasaki", "Z","Bike","900", "2019", true, "Waidhan") );
      //  vehicles.add(new Vehicle("Kawasaki", "Ninja","Bike","1250", "2020", true, "VindhyaNagar") );

    }

    @Override
    public boolean newVehicle(Vehicle vehicle) {

        vehicles.add(vehicle);
        return true;

    }


    @Override
    public List<Vehicle> getAllVehicle() {

        return vehicles;

    }

    @Override
    public Branch onboardNewBranch(Branch branch) {

        Branch branch2=new Branch();
        branch2.setBranch_name(branch.getBranch_name());
        branch2.setCity_name(branch.getCity_name());
        branch2.setVehicles(branch.getVehicles());
        branches.add(branch2);

        return branch2;
    }

    @Override
    public List<Branch> onboarded(String BranchName) {

        List<Vehicle> vehicles1=vehicles.stream().filter(e->
                e.getBranch_name().equals(BranchName) && e.isVehicle_available()).collect(Collectors.toList());

       //  System.out.println(vehicles1);  // kawasaki, honda
        List<Vehicle> v1 =branches
                .stream()
                .filter(e->
                e.getBranch_name().equals(BranchName)
        ).findFirst()
                .get()
                .getVehicles();
      //  System.out.println(v1);  // yahama
        vehicles1.addAll(v1);
       Optional<Branch> b2= branches.stream().filter(e-> e.getBranch_name().equals(BranchName)).findFirst();
        branches.get(0).setVehicles(vehicles1);

       return branches;
    }


}
