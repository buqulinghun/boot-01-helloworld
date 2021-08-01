package boot.config;

import boot.bean.Pet;
import boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 1 配置类里里面使用@Bean 标注在方法上给容器注册组件，默认也是单实例
 * 2 配置类本身也是组件
 * 3、proxyBeanMethods:代理bean方法
 *      Full(proxyBeanMethods = true) 保证每个@Bean方法被调用多少次返回的组件都是单实例的
 *      lite(proxyBeanMethods = false) 每个@Bean方法被调用多少次返回的组件都是新创建的
 */
@Configuration(proxyBeanMethods = false)
public class MyConfig {

    @Bean
    public User user01() {
        User user = new User("zhangsan", 18);
        return user;
    }

    @Bean("tom01")
    public Pet tomcatPet() {
        return new Pet("tomcatPet");
    }

}
