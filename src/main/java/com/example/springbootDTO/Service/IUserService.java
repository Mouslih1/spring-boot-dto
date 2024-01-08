package com.example.springbootDTO.Service;

import com.example.springbootDTO.DTO.UserLocationDTO;

import java.util.List;

public interface IUserService {
    List<UserLocationDTO> getAllUsersLocation();
}
