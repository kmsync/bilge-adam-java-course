package tr.com.burakgul.profileapi.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tr.com.burakgul.profileapi.model.dto.ResumeDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Burcu Salman
 */
@Entity
@Table(name = "resume")
@Getter
@Setter
@NoArgsConstructor
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company")
    private String company;

    @Column(name = "total_experience")
    private int totalExperience;

    @Column(name = "type")
    private String type;

    public Resume(ResumeDTO resumeDTO){
        this.company = resumeDTO.getCompany();
        this.totalExperience = resumeDTO.getTotalExperience();
        this.type = resumeDTO.getType();
    }
}
