package spring01.core.discount;

import spring01.core.grade.Member;

public interface DiscountPolicy {

    /**
     *
     * @return 할인 긍액 대상
     */

    int discount(Member member, int price);

}
