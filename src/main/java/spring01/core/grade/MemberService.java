package spring01.core.grade;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
