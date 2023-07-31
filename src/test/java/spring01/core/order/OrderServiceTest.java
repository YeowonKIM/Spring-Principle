package spring01.core.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import spring01.core.discount.Order;
import spring01.core.discount.OrderService;
import spring01.core.discount.OrderServiceImpl;
import spring01.core.grade.Grade;
import spring01.core.grade.Member;
import spring01.core.grade.MemberService;
import spring01.core.grade.MemberServiceImpl;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder(){
        Long memberId = 1L;
        Member member = new Member(memberId, "Ruffy", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
