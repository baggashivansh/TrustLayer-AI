package trustlayer.service;

import org.springframework.stereotype.Service;

@Service
public class PolicyService {

    public boolean allowed(String input) {
        return true;
    }
}
