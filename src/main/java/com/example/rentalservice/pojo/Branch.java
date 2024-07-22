package com.example.rentalservice.pojo;


import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Branch {

    private  String branch_name;
    private String city_name;
   private List<Vehicle> vehicles;


}
