package trustlayer.service;

import org.springframework.stereotype.Service;

@Service
public class ModelRoutingService {

    public String route() {
        return "default model";
    }
}
