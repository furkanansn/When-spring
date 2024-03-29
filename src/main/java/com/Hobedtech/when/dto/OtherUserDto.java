package com.Hobedtech.when.dto;

import java.util.Set;

import com.Hobedtech.when.entity.CheckIn;
import com.Hobedtech.when.entity.Events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * When Created by furkanansin on Oct, 2020
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OtherUserDto {
    private Long id;
    private String username;
    private String nameSurname;
    private String bio;
    private String firebaseId;
    private String school;
    private String image;
    private Integer age;
    private String latitude;
    private String longitude;
    private String gender;
    private String friendStituation;
    private Object frien;
    private Set<CheckIn> checkIns;
    private Set<Events> events;
}
