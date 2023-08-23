package spring01.core.web;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring01.core.common.MyLogger;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class LogDemoController {

    private final LogDemoService logDemoService;
    // MyLogger를 주입 받는 것이 아니라, MyLogger를 찾을 수 있는 Dependency Lookup할 수 있는 것이 주입된다.
    private final ObjectProvider<MyLogger> myLoggerProvider;

    @RequestMapping("log-demo")
    @ResponseBody
    public String logDemo(HttpServletRequest request) {
        String requestURL = request.getRequestURL().toString();
        // 1) 이 시점에 처음 만들어 짐.
        MyLogger myLogger = myLoggerProvider.getObject();
        // 3) setRequestURL
        myLogger.setRequestURL(requestURL);

        // 4) log 찍기
        myLogger.log("controller test");
        logDemoService.logic("testID");

        return "OK";
    }

}
