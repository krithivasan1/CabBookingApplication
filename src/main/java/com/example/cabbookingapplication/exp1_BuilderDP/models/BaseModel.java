package com.example.cabbookingapplication.exp1_BuilderDP.models;


import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseModel {

    private double id;
    private String name;
}
