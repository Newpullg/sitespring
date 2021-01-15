package com.labwork.sitespring.mapper;

import com.labwork.sitespring.dto.OrderDTO;
import com.labwork.sitespring.entity.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderToOrderDTOMapper {
    public Order toEntity(final OrderDTO orderDTO){



        final Order order = new Order();

        orderDTO.setId(order.getId());
        order.setOrderDate(order.getOrderDate());
        order.setOrderDetails(order.getOrderDetails());

        return order;
    }

    public OrderDTO toDTO(final Order order){
        final OrderDTO orderDTO = new OrderDTO();

        orderDTO.setId(order.getId());
        orderDTO.setOrderDate(order.getOrderDate());
        orderDTO.setOrderDetails(order.getOrderDetails());

        if(order.getUser()!=null){
            orderDTO.setUserFirstname(order.getUser().getFirstname());
            orderDTO.setUserLastname(order.getUser().getLastname());
        }

        return orderDTO;
    }
}
