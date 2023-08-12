package spring01.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import spring01.core.member.MemberRepository;
import spring01.core.member.MemoryMemberRepository;

@Configuration
@ComponentScan (
        basePackages =  "spring01.core",
        basePackageClasses = AutoAppConfig.class,
        excludeFilters =  @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
// @ComponentScan : @Component 붙은 클래스를 찾아서 자동으로 스프링 빈으로 등록해 준다.
// AppConfig, TestConfig를 일단 유지하기 위해 예외 필터로 Configuration.class 제거해준다. (일반적으로 제외하지 않음)
public class AutoAppConfig {

}
