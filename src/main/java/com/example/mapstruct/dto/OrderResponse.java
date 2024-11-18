package com.example.mapstruct.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderResponse {
    private String clientName;
    private String productName;
    private String formattedPrice;
    private String purchaseDate;
}
