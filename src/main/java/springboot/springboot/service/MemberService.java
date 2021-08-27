package springboot.springboot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springboot.springboot.domain.repository.MemberRepository;
import springboot.springboot.dto.MemberDto;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;


    public Long joinUser(MemberDto memberDto) {
        return memberRepository.save(memberDto.toEntity()).getId();
    }
}
