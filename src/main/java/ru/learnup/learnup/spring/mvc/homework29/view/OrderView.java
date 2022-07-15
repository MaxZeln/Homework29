package ru.learnup.learnup.spring.mvc.homework29.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import ru.learnup.learnup.spring.mvc.homework29.entity.User;
import ru.learnup.learnup.spring.mvc.homework29.model.OrderDetailsDto;

import java.util.List;

@Data
public class OrderView {

    @JsonProperty
    private int id;
    @JsonProperty
    private int purchase_amount;
    @JsonProperty
    private UserView user;
    @JsonProperty
    private OrderDetailsView order_detail;

}
