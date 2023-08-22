package spring01.core.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring01.core.common.MyLogger;

@Service
@RequiredArgsConstructor
public class LogDemoService {

    private final MyLogger myLogger;

    public void logic(String id) {
        myLogger.log("service id = " + id);
    }

}
