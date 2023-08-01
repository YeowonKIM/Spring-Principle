package spring01.core.discount;

import spring01.core.member.Member;

public interface DiscountPolicy {

    /**
     *
     * @return 할인 긍액 대상
     */

    int discount(Member member, int price);

}
