package mockfailure;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import mockfailure.data.MyCrudRepository;
import mockfailure.data.MyModelClass;

@SpringBootTest
public class MockfailureTest {
	@SpyBean
	protected MyCrudRepository myCrudRepository;
	
	@Test
	public void test() {
		Mockito.verify(myCrudRepository, Mockito.times(1)).save(Mockito.any(MyModelClass.class));
	}
}
