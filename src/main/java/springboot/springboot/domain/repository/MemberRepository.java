package springboot.springboot.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.springboot.domain.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
