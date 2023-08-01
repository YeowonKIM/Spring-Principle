package spring01.core.order;

import spring01.core.discount.DiscountPolicy;
import spring01.core.member.Member;
import spring01.core.member.MemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

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
