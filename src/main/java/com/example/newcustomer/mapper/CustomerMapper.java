package com.example.newcustomer.mapper;

import com.example.newcustomer.dto.CustomerDto;
import com.example.newcustomer.entity.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer toEntity(CustomerDto customerDto);
    CustomerDto toDto(Customer customer);
}