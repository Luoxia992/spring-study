import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Person,xml");
		Object person = classPathXmlApplicationContext.getBean("person");
		System.out.println(person);

	}
}
