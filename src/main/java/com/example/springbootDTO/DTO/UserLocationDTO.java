package com.example.springbootDTO.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLocationDTO {
    private Long user_id;
    private String email;
    private String place;
    private double longitude;
    private double latitude;
}
