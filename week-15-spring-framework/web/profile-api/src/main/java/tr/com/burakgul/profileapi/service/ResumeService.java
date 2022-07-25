package tr.com.burakgul.profileapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
import tr.com.burakgul.profileapi.model.dto.ResumeDTO;
import tr.com.burakgul.profileapi.model.entity.Resume;
import tr.com.burakgul.profileapi.repository.ResumeRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ResumeService {

    private final ResumeRepository resumeRepository;

    @Transactional(readOnly = true)
    public List<ResumeDTO> findAllResumes() {
        List<Resume> resumes = this.resumeRepository.findAll();

        List<ResumeDTO> resumeDTOS = new ArrayList<>();

        /*
        for (int i = 0; i < resumes.size(); i++) {
            ResumeDTO resumeDTO = new ResumeDTO(resumes.get(i));
            resumeDTOS.add(resumeDTO);
        }
        */

        /*
        for(Resume resume : resumes){
            ResumeDTO resumeDTO = new ResumeDTO(resume);
            resumeDTOS.add(resumeDTO);
        }
        */

        resumes.forEach((resume) -> {
            ResumeDTO resumeDTO = new ResumeDTO(resume);
            resumeDTOS.add(resumeDTO);
        });

        return resumeDTOS;

        //return resumes.stream().map(ResumeDTO::new).collect(Collectors.toList());
    }

    @Transactional
    public void deleteResume(Long id) {
        if(this.resumeRepository.existsById(id)){
            this.resumeRepository.deleteById(id);
        }else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Verilen id ile resume bulunamadı.");
        }
    }

    @Transactional
    public ResumeDTO saveResume(ResumeDTO resume) {
        Resume resumeEntity = new Resume(resume);
        Resume savedResume = this.resumeRepository.save(resumeEntity);
        ResumeDTO resumeDTO = new ResumeDTO(savedResume);
        return resumeDTO;
    }

    @Transactional(readOnly = true)
    public long countResume() {
        long countedResume = this.resumeRepository.count();
        return countedResume;
    }

    @Transactional
    public ResumeDTO update(ResumeDTO resumeRequest, Long id) {
        Resume resume = this.resumeRepository.findById(id)
                .orElseThrow(() ->  new ResponseStatusException(HttpStatus.BAD_REQUEST,
                        "id ile resume bulunamadı."));
        resume.setCompany(resumeRequest.getCompany());
        resume.setTotalExperience(resumeRequest.getTotalExperience());
        resume.setType(resumeRequest.getType());
        this.resumeRepository.save(resume);
        return new ResumeDTO(resume);
    }
}
