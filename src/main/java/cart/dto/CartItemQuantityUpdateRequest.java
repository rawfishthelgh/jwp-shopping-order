package cart.dto;

import javax.validation.constraints.Positive;

public class CartItemQuantityUpdateRequest {

    @Positive
    private int quantity;

    public CartItemQuantityUpdateRequest() {
    }

    public CartItemQuantityUpdateRequest(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
