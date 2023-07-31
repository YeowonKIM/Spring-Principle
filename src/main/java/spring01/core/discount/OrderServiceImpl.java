package spring01.core.discount;

import spring01.core.grade.Member;
import spring01.core.grade.MemberRepository;
import spring01.core.grade.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    /*
        단일 책임 원칙이 잘 지켜진 설계.
        할인에 대한 변경이 필요할 때, OrderService는 변경할 필요없이 DiscountPolicy만 고치면 된다.
     */
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
