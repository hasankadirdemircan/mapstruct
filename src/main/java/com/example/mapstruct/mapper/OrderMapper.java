package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.OrderResponse;
import com.example.mapstruct.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    @Mapping(target = "clientName", source = "order.customerName") //if field names are different
    @Mapping(target = "purchaseDate", source = "order.orderDate", dateFormat = "dd-MM-yyyy") //if field names are different
    @Mapping(target = "formattedPrice", expression = "java(formatPrice(order.getPrice()))") //calling formatPrice() method
    OrderResponse orderToOrderResponse(Order order);

    default String formatPrice(Double price) {
        return price == null ? null : "$" + String.format("%.2f", price);
    }
}
