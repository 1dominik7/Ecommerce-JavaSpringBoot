package com.ecommerce_store.project.service;

import com.ecommerce_store.project.model.User;
import com.ecommerce_store.project.payload.AddressDTO;
import jakarta.validation.Valid;

import java.util.List;

public interface AddressService {
    AddressDTO createAddress(AddressDTO addressDTO, User user);

    List<AddressDTO> getAllAddresses();

    AddressDTO getAddressesById(Long addressId);

    List<AddressDTO> getUserAddresses(User user);

    AddressDTO updateAddress(@Valid Long addressId, AddressDTO addressDTO);

    String deleteAddress(Long addressId);
}
