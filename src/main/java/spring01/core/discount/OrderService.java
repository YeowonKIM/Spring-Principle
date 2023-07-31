package spring01.core.discount;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
