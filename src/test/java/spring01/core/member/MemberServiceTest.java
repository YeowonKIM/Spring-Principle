package spring01.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import spring01.core.grade.Grade;
import spring01.core.grade.Member;
import spring01.core.grade.MemberService;
import spring01.core.grade.MemberServiceImpl;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        // given
        Member member = new Member(1L, "Ruffy", Grade.VIP);

        // when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
