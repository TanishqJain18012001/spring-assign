package collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class collectionclass {
	public static void main( String[] args ) {
		
		ApplicationContext context =
        		new ClassPathXmlApplicationContext("collections/collectionconfig.xml");
			
		Emp empData = (Emp) context.getBean("emp1");
        System.out.println(empData);		
	}
}
