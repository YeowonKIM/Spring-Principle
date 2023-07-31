package spring01.core.grade;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
