package tr.com.burakgul.profileapi.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tr.com.burakgul.profileapi.model.dto.SkillDTO;
import tr.com.burakgul.profileapi.model.dto.SkillRequest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Samet Çoruk, Canberk Erdem
 */
@Entity
@Table(name = "skill")
@Getter
@Setter
@NoArgsConstructor
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Short progress;

    public Skill(SkillDTO skillDTO){
        this(skillDTO.getTitle(),skillDTO.getProgress());
        this.id = skillDTO.getId();
    }

    public Skill(SkillRequest skillRequest){
        this(skillRequest.getTitle(),skillRequest.getProgress());
    }

    private Skill(String title, Short progress){
        this.title = title;
        this.progress = progress;
    }
}
