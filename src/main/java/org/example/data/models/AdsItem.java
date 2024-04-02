package org.example.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class AdsItem {
    @Id
    private String itemId;
    private String itemName;
    private String itemDescription;
    private double itemPrice;
}
