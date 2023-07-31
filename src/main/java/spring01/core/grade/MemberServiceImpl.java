package spring01.core.grade;

public class MemberServiceImpl implements MemberService{

    // 구현체가 없으면 NPE 나니까 구현체를 선택해 주어야 함.
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }



}
