package spring01.core.common;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.UUID;

@Component
@Scope(value = "request")
public class MyLogger {

    private String uuid;
    private String requestURL;

    public void setRequestURL(String requestURL) {
        this.requestURL = requestURL;
    }

    public void log(String message) {
        System.out.println("[" + uuid + "]" + "[" + requestURL + "]" + message);
    }

    @PostConstruct
    public void init() {
        // 고유한 uuid 값이 만들어 진다.
        // 1)이 생성될 떄 init이 실행되면서 request랑 연결됨
        uuid = UUID.randomUUID().toString();
        System.out.println("[" + uuid + "] request scope bean created: " + this );
    }

    // request scope는 소멸이 된다.
    @PreDestroy
    public void close() {
        System.out.println("[" + uuid + "] request scope bean closed: " + this );
    }

}
