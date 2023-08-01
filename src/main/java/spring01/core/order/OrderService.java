package spring01.core.order;

import spring01.core.order.Order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
