package com.Hobedtech.when.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HouseInitializeDto {
    private Long id;
    private String title;
    private String eventImagePath;
    private String city;
    private Date date;
}
