package tr.com.burakgul.profileapi.repository;
import org.springframework.stereotype.Repository;
import tr.com.burakgul.profileapi.model.entity.Project;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
