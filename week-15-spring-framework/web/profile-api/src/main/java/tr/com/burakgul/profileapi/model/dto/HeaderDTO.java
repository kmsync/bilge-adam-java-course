package tr.com.burakgul.profileapi.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tr.com.burakgul.profileapi.model.entity.Header;

@Getter
@Setter
@NoArgsConstructor
public class HeaderDTO {
    private String title;
    private String subtitle;
    private String socialMediaUrl;

    public HeaderDTO(Header header){
        this.title = header.getTitle();
        this.subtitle = header.getSubtitle();
        this.socialMediaUrl = header.getSocialMediaUrl();
    }
}
