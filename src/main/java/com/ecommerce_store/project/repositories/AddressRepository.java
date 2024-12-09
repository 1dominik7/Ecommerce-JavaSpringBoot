package com.ecommerce_store.project.repositories;

import com.ecommerce_store.project.model.Address;
import com.ecommerce_store.project.payload.AddressDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {


}
