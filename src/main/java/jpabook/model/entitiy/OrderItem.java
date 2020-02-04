package jpabook.model.entitiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder @AllArgsConstructor
@Getter @NoArgsConstructor
@Entity @Table(name = "order_item")
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "order_price")
    private int orderPrice;

    private int count;
}
