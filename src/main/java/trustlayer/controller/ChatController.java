package trustlayer.controller;

import org.springframework.web.bind.annotation.*;
import trustlayer.model.ChatRequest;
import trustlayer.model.ChatResponse;
import trustlayer.service.AiGatewayService;

@RestController
@RequestMapping("/chat")
public class ChatController {

    private final AiGatewayService service;

    public ChatController(AiGatewayService service) {
        this.service = service;
    }

    @PostMapping
    public ChatResponse chat(@RequestBody ChatRequest request) {
        return service.process(request);
    }
}
