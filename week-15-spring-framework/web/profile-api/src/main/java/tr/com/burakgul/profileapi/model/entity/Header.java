package tr.com.burakgul.profileapi.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tr.com.burakgul.profileapi.model.dto.HeaderDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "header")
@Getter
@Setter
@NoArgsConstructor
public class Header {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name= "subtitle")
    private String subtitle;

    @Column(name = "social_media_url")
    private String socialMediaUrl;

    /*
    @NoArgsConstructor bu constructor'ı zaten oluşturuyor.
    public Header(){

    }*/

    public Header(HeaderDTO headerDTO){
        this.socialMediaUrl = headerDTO.getSocialMediaUrl();
        this.subtitle = headerDTO.getSubtitle();
        this.title = headerDTO.getTitle();
    }
}
