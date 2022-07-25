package tr.com.burakgul.profileapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
import tr.com.burakgul.profileapi.model.dto.HeaderDTO;
import tr.com.burakgul.profileapi.model.entity.Header;
import tr.com.burakgul.profileapi.repository.HeaderRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HeaderService {

    private final HeaderRepository headerRepository;

    @Transactional(readOnly = true)
    public HeaderDTO findHeader() {
        Optional<Header> header = this.headerRepository.findFirstByOrderById();
        if (header.isPresent()) {
            return new HeaderDTO(header.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Header bulunamadı.");
        }
    }

    @Transactional
    public HeaderDTO saveHeader(HeaderDTO header) {
        Header headerEntity = new Header(header);
        Header savedHeader = this.headerRepository.save(headerEntity);
        HeaderDTO headerDTO = new HeaderDTO(savedHeader);
        return headerDTO;

    }
}
