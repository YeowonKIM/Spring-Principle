package spring01.core.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class BeanLifeCycleTest {

    @Test
    public void lifeCycleTest() {
        // ConfigurableApplicationContext은 close 하기 위해 쓰임 (AnnotationConfigApplicationContext의 상위 클래스)
        ConfigurableApplicationContext ac = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
        NetworkClient client = ac.getBean(NetworkClient.class);
        ac.close();
    }

    @Configuration
    static class LifeCycleConfig {
        //@Bean의 destroyMethod 는 기본값이 (inferred) (추론)으로 등록되어 있기 때문에, close , shutdown 라는 이름의 메서드를 자동으로 호출해준다.
        @Bean(initMethod = "init", destroyMethod = "close")
        public NetworkClient networkClient() {
            NetworkClient networkClient = new NetworkClient();
            networkClient.setUrl("http://spring01-core.dev");
            return networkClient;
        }

    }
}
