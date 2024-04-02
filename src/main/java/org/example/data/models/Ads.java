package org.example.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
@Data
public class Ads {
    @Id
    private String id;
    private LocalDateTime creationDate;
    private String userId;
    private Category category;
    private Location location;
    private AdsItem adsItem;
}
