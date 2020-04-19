import com.model.pojo.Goods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class SpringTest {
//    @Resource
//    private StudentServiceImpl studentService;
//    @Resource
//    private GoodsServiceImpl goodsService;


    @Test
    public void testSpring() {

//        List<Goods> goods = goodsService.queryGoods();
//        System.out.println("Goods" + goods);
    }


}
