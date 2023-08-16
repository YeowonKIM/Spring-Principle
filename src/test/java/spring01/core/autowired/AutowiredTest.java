package spring01.core.autowired;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;
import spring01.core.member.Member;

import java.util.Optional;

public class AutowiredTest {

//    @Test
//    void AutowiredOption() {
//        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
//
//    }
//
//    static class TestBean {
//
//        @Autowired(required = true)
//        public void setNoBean1(Member noBean1){
//            // 현재 Member 클래스는 스프링 빈으로 등록 안 되어 있음
//            System.out.println("noBean1 = " + noBean1);
//        }
//
//        @Autowired
//        public void setNoBean2(@Nullable Member noBean2){
//            System.out.println("noBean2 = " + noBean2);
//        }
//
//        @Autowired
//        public void setNoBean3(Optional<Member> noBean3){
//            System.out.println("noBean3 = " + noBean3);
//        }
//    }
}
