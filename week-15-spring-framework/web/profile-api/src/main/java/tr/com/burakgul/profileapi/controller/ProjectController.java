package tr.com.burakgul.profileapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tr.com.burakgul.profileapi.model.dto.ProjectDTO;
import tr.com.burakgul.profileapi.model.dto.ProjectDescriptionDTO;
import tr.com.burakgul.profileapi.service.ProjectService;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/projects")
public class ProjectController {
    private final ProjectService projectService;

    @GetMapping(params = "id")
    public ResponseEntity<ProjectDTO> findProjectById(@RequestParam Long id){ // findProjectById
        return ResponseEntity.ok(this.projectService.findProjectById(id));
    }

    @GetMapping
    public ResponseEntity<List<ProjectDTO>> findAll(){
        return ResponseEntity.ok(this.projectService.findAll());
    }

    @PostMapping
    public ResponseEntity<ProjectDTO> saveProject(@RequestBody ProjectDTO project){
        return ResponseEntity.ok(this.projectService.saveProject(project));
    }

    @PutMapping(params = "id")
    public ResponseEntity<Void> updateProjectDescription(@RequestBody ProjectDescriptionDTO project, @RequestParam Long id){
        this.projectService.updateProjectDescription(project, id);
        return ResponseEntity.ok().build();
    }

}
