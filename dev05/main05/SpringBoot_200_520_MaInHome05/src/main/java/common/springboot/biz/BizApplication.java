package common.springboot.biz;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class BizApplication {
    @RequestMapping("/")
    String index() {
        return "Hello Spring Boot";
    }
    @RequestMapping("/getUser")
    String getUser() {
        Gson gson = new Gson();
        List<User> list=new ArrayList();
        User user=new User("SN3001","张三3001");
        list.add(user);
        user=new User("SN3002","张三3002");
        list.add(user);
        user=new User("SN3003","张三3003");
        list.add(user);
        String jsonList = gson.toJson(list);
        return  jsonList;
    }
    public static void main(String[] args) {
        SpringApplication.run(BizApplication.class, args);
    }
}
