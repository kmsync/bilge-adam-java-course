package tr.com.burakgul.profileapi.model.dto;


import lombok.Getter;
import lombok.Setter;
import tr.com.burakgul.profileapi.model.entity.Skill;

@Getter
@Setter
public class SkillDTO {
    private Long id;
    private String title;
    private Short progress;

    public SkillDTO(Skill skill){
        this.id = skill.getId();
        this.title = skill.getTitle();
        this.progress = skill.getProgress();
    }
}
