package maven_project;

import org.testng.annotations.*;

public class Testcase2 {
	@Test
	public void create_bubble() {
		System.out.println("Hello Create bubble 4"+Thread.currentThread().getId());
	}
	@Test
	public void make_videocall() {
		System.out.println("Hello make videocall 5"+Thread.currentThread().getId());
		
	}

}
