package com.UST.Flightservices.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="passanger_info")
public class Passengerinfo {
    @Id
    @GeneratedValue
    private Long pId;
    private String name;
    private String email;
    private String source;
    private String Destination;
    private Date traveldate;
    private  String pickupTime;
    private  String arrivalTime;
    private double fare;
    }

