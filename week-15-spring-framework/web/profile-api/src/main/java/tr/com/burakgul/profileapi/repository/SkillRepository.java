package tr.com.burakgul.profileapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.burakgul.profileapi.model.entity.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill,Long> {
}
