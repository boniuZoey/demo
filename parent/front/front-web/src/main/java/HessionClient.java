import cn.zoey.ssm.model.PersonInfo;
import cn.zoey.ssm.service.PersonInfoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description: hession客户端
 *
 * @author By zhangting
 * @date 2018/06/08
 */
public class HessionClient {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("remote-client.xml");
        PersonInfoService personInfoService = (PersonInfoService)applicationContext.getBean("personInfoService");
        PersonInfo personInfo = personInfoService.queryPersonInfoByName("张三");

        System.out.println(personInfo.toString());



    }
}
