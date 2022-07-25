package tr.com.burakgul.profileapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
import tr.com.burakgul.profileapi.model.dto.ProjectDTO;
import tr.com.burakgul.profileapi.model.dto.ProjectDescriptionDTO;
import tr.com.burakgul.profileapi.repository.ProjectRepository;
import tr.com.burakgul.profileapi.model.entity.Project;

import java.util.Optional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectRepository projectRepository;

    @Transactional(readOnly = true)
    public ProjectDTO findProjectById(Long id){
        Optional<Project> project = this.projectRepository.findById(id);
        if(project.isPresent()){
            return new ProjectDTO(project.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Project is not found");
        }
    }

    @Transactional
    public ProjectDTO saveProject(ProjectDTO project){
        Project projectEntity = new Project(project);
        Project savedProject = this.projectRepository.save(projectEntity);
        ProjectDTO projectDTO = new ProjectDTO(savedProject);
        return projectDTO;
    }

    @Transactional(readOnly = true)
    public List<ProjectDTO> findAll(){
        List<Project> projects = this.projectRepository.findAll();
        List<ProjectDTO> projectDTOS = projects.stream()
                .map(ProjectDTO::new)
                .collect(Collectors.toList());

        return projectDTOS;
    }

    @Transactional
    public ProjectDTO updateProjectDescription(ProjectDescriptionDTO project, Long id){
        Project projectEntity = this.projectRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,
                        "Gönderilen id ile project bulunamadı."));
        projectEntity.setDescription(project.getDescription());
        Project updatedProject = this.projectRepository.save(projectEntity);
        ProjectDTO projectDTO = new ProjectDTO(updatedProject);
        return projectDTO;
    }
}
