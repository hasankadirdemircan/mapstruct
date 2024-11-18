package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.OrderResponse;
import com.example.mapstruct.model.Order;
import java.time.format.DateTimeFormatter;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-18T23:03:32+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
public class OrderMapperImpl implements OrderMapper {

    private final DateTimeFormatter dateTimeFormatter_dd_MM_yyyy_1156787200 = DateTimeFormatter.ofPattern( "dd-MM-yyyy" );

    @Override
    public OrderResponse orderToOrderResponse(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderResponse orderResponse = new OrderResponse();

        orderResponse.setClientName( order.getCustomerName() );
        if ( order.getOrderDate() != null ) {
            orderResponse.setPurchaseDate( dateTimeFormatter_dd_MM_yyyy_1156787200.format( order.getOrderDate() ) );
        }
        orderResponse.setProductName( order.getProductName() );

        orderResponse.setFormattedPrice( formatPrice(order.getPrice()) );

        return orderResponse;
    }
}
