package tr.com.burakgul.profileapi.model.dto;

import lombok.Getter;
import lombok.Setter;
import tr.com.burakgul.profileapi.model.entity.Skill;

@Getter
@Setter
public class SkillRequest {
    private String title;
    private Short progress;

    public SkillRequest(Skill skill){
        this.title = skill.getTitle();
        this.progress = skill.getProgress();
    }
}
