package cart.dto;

import java.util.List;

public class OrderCreateRequest {
    List<OrderItem> orderItems;
    PaymentDto payment;

    public OrderCreateRequest() {
    }

    public OrderCreateRequest(final List<OrderItem> orderItems, final PaymentDto payment) {
        this.orderItems = orderItems;
        this.payment = payment;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public PaymentDto getPayment() {
        return payment;
    }
}
