package blu.springkub.weblayer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(
        properties = {
                "spring.datasource.url = jdbc:h2:mem:testdb"
        }
        )
public class WebLayerApplicationTests {

//    # Old
//    static {
//        System.setProperty("spring.datasource.url", "jdbc:h2:mem:testdb");
//    }

    @Test
    public void contextLoads() {
    }

}
