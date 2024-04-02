package org.example.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
@Data
public class Location {
@Id
    private String id;
    private String name;
    private String country;
    private String city;

}
