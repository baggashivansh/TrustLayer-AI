package trustlayer.service;

import org.springframework.stereotype.Service;
import trustlayer.model.ChatRequest;
import trustlayer.model.ChatResponse;

@Service
public class AiGatewayService {

    public ChatResponse process(ChatRequest request) {
        ChatResponse response = new ChatResponse();
        response.setReply("placeholder response");
        return response;
    }
}
