package tr.com.burakgul.profileapi.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tr.com.burakgul.profileapi.model.entity.Project;

@Getter
@Setter
@NoArgsConstructor
public class ProjectDTO {
    private String projectName;
    private String description;
    private String projectUrl;

    public ProjectDTO(Project project){
        this.projectUrl = project.getProjectUrl();
        this.projectName = project.getProjectName();
        this.description = project.getDescription();
    }
}
