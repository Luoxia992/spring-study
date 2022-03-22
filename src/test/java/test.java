import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Person,xml");

		classPathXmlApplicationContext.getBean("person");
		
		Object person = classPathXmlApplicationContext.getBean("person");
		System.out.println(person);

	}
}
