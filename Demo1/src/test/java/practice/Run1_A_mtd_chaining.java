package practice;

import org.testng.annotations.Test;

import com.backend.testing.A_mtd_chaining;
import static com.backend.testing.A_mtd_chaining.*;

public class Run1_A_mtd_chaining {

	@Test
	public void sampleTest() {
		A_mtd_chaining aa=new A_mtd_chaining();
		aa.a().b().c();
		
	}
	
	@Test
	public void sampleTTest() {
		a1().b1().c1();
	}
}
