package com.example.springbootDTO.Controller;

import com.example.springbootDTO.DTO.UserLocationDTO;
import com.example.springbootDTO.Service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private IUserService iUserService;

    @GetMapping
    public List<UserLocationDTO> getAllUsersLocation()
    {
        return iUserService.getAllUsersLocation();
    }
}
