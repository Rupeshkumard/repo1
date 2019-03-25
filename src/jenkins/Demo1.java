package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void test() {
		Reporter.log("test1",true);
	}

}
