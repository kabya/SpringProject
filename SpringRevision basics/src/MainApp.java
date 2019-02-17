import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Teacher teacher = context.getBean("Teacher", Teacher.class);
		System.err.println(teacher.Subject());
		System.err.println(teacher.IsOnHoliday());
		
		context.close();
		
	}

}
