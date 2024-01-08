package com.example.springbootDTO.Service.Impl;

import com.example.springbootDTO.DTO.UserLocationDTO;
import com.example.springbootDTO.Model.User;
import com.example.springbootDTO.Repository.IUserRepository;
import com.example.springbootDTO.Service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class UserService implements IUserService{

    private IUserRepository iUserRepository;

    @Override
    public List<UserLocationDTO> getAllUsersLocation()
    {
        return iUserRepository.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    private UserLocationDTO convertEntityToDto(User user)
    {
        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO.setUser_id(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());
        userLocationDTO.setLatitude(user.getLocation().getLatitude());

        return userLocationDTO;
    }
}
