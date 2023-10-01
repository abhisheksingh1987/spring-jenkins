package springbootjsonexample;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootCrudApplication2ApplicationTests {

	
	public static Logger logger=LoggerFactory.getLogger(SpringBootCrudApplication2ApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true,true);
	}

}
