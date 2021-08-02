package boot;

import boot.bean.Pet;
import boot.bean.User;
import boot.config.MyConfig;
import ch.qos.logback.core.db.DBHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 主程序类
 * @SpringBootApplication:这是一个SpringBoot应用
 */
@SpringBootApplication
public class MainApllication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApllication.class, args);

        String[] names = run.getBeanDefinitionNames();
        for (String name : names){
            System.out.println(name);
        }
        System.out.println();
        /*
        Pet tom01 = run.getBean("tom01", Pet.class);
        Pet tom02 = run.getBean("tom01", Pet.class);
        System.out.println("Pet obj :"+(tom01 == tom02));

        MyConfig config = run.getBean(MyConfig.class);
        System.out.println(config);

        User user01 = config.user01();
        User user02 = config.user01();
        System.out.println("user obj:"+(user02 == user01));


        String[] namesForType = run.getBeanNamesForType(User.class);
        for (String s: namesForType) {
            System.out.println(s);
        }

        DBHelper bean1 = run.getBean(DBHelper.class);
        System.out.println(bean1);
        */

        User user04 = run.getBean("user01", User.class);
        System.out.println("user04:"+user04);
        
        Pet pet01 = run.getBean("tom01", Pet.class);
        System.out.println("pet01:"+pet01);


    }


}
