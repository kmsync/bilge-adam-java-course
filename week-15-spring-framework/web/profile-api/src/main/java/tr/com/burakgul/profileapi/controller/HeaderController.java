package tr.com.burakgul.profileapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.burakgul.profileapi.model.dto.HeaderDTO;
import tr.com.burakgul.profileapi.service.HeaderService;

@RestController
@RequestMapping("/header")
public class HeaderController {

    private final HeaderService headerService;

    // Bu bir RequiredArgsConstructor
    public HeaderController(HeaderService headerService){
        this.headerService = headerService;
    }

    @GetMapping
    public ResponseEntity<HeaderDTO> findHeader(){
        return ResponseEntity.ok(this.headerService.findHeader());
    }

    @PostMapping
    public ResponseEntity<HeaderDTO> saveHeader(@RequestBody HeaderDTO header){
        return ResponseEntity.ok(this.headerService.saveHeader(header));
    }
}
