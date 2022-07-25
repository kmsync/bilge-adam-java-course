package tr.com.burakgul.profileapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.burakgul.profileapi.model.dto.ResumeDTO;
import tr.com.burakgul.profileapi.service.ResumeService;

import java.util.List;

@RestController
@RequestMapping("/resume")
public class ResumeController {

    private final ResumeService resumeService;

    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @GetMapping
    public ResponseEntity<List<ResumeDTO>> findResume() {
        return ResponseEntity.ok(this.resumeService.findAllResumes());
    }

    @PostMapping
    public ResponseEntity<ResumeDTO> saveResume(@RequestBody ResumeDTO resume) {
        return ResponseEntity.ok(this.resumeService.saveResume(resume));
    }

    @DeleteMapping("/{id}") // http://localhost:8081/resume/1
    public ResponseEntity<Void> deleteResume(@PathVariable Long id) {
        this.resumeService.deleteResume(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResumeDTO> updateResume(@RequestBody ResumeDTO resume, @PathVariable Long id) {
        return ResponseEntity.ok(this.resumeService.update(resume, id));
    }
}
