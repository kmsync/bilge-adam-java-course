package tr.com.burakgul.profileapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
import tr.com.burakgul.profileapi.model.dto.SkillDTO;
import tr.com.burakgul.profileapi.model.dto.SkillRequest;
import tr.com.burakgul.profileapi.model.entity.Skill;
import tr.com.burakgul.profileapi.repository.SkillRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SkillService {
    private final SkillRepository skillRepository;

    @Transactional(readOnly = true)
    public List<SkillDTO> findAll(){
        return this.skillRepository.findAll().stream().map(SkillDTO::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public SkillDTO findById(Long id){
        Skill skill = this.skillRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,
                        "Id ile skill bulunamadı."));
        return new SkillDTO(skill);
    }

    @Transactional
    public SkillDTO save(SkillRequest skillRequest){
        Skill savedSkill = this.skillRepository.save(new Skill(skillRequest));
        return new SkillDTO(savedSkill);
    }
}
