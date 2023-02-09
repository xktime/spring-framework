package local;

/**
 * @Author: luoliwen
 * @Description
 * @Date: 2023/2/9 9:32
 */

import local.bean.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

	@Test
	public void test() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-test.xml");
		Student student = (Student)applicationContext.getBean("student");
		System.out.println(student.getUsername());
		System.out.println("我获取用户名了："+student.getUsername());
	}
}
