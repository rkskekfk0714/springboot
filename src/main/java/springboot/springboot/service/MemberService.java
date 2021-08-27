package springboot.springboot.service;

import springboot.springboot.domain.repository.MemberRepository;
import springboot.springboot.dto.MemberDto;

import javax.transaction.Transactional;

public class MemberService {

    private MemberRepository memberRepository;

    @Transactional
    public Long joinUser(MemberDto memberDto) {
        return memberRepository.save(memberDto.toEntity()).getId();
    }
}
