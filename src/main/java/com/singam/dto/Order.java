package com.singam.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Order {

    private int id;
    private String name;
    private int qty;
    private double price;
    private String transactionId;
    private Date orderPlacedDate;
}
