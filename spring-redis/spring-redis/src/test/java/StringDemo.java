import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Set;

@ContextConfiguration(locations = {"classpath:spring.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class StringDemo {

    @Resource
    private RedisTemplate redisTemplate;


    @Test
    public void testGetValue(){
        System.out.println("hello");
//        redisTemplate.delete("brandList");
//        redisTemplate.delete("specList");
//        redisTemplate.delete("content");
       //System.out.println(redisTemplate.boundHashOps("brandList").get(35l));
//        System.out.println(redisTemplate.boundHashOps("specList").get(35l));
//        System.out.println(redisTemplate.boundHashOps("content").get(1l));
     /*   redisTemplate.delete("brandList");
      redisTemplate.delete("specList");
       redisTemplate.delete("content");*/
    }

}
