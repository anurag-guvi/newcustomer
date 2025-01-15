package com.example.newcustomer.dto;

import lombok.Data;

@Data
public class CustomerDto {
    private Long id;
    private String name;
    private String address;
    private Double salary;
}