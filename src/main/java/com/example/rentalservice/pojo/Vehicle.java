package com.example.rentalservice.pojo;


import lombok.*;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Vehicle {

    private String vehicle_company;
   private String vehicle_name;
   private String vehicle_type;
   private String model_no;
   private String mfg_year;
   private boolean vehicle_available;
   private String branch_name;


}
