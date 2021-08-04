package boot.controller;

import boot.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@Slf4j
@RestController
public class HelloController  {
    @Autowired
    private Car mCar;

    @RequestMapping("/hello")

    public String handle01() {
        return "hello,spring boot 2";
    }

    @RequestMapping("/car")
    public Car car() {
        log.info("yubin control car");
        return mCar;
    }
}
