
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringLayer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx=new ClassPathXmlApplicationContext("myspring.xml");

Trainee v=(Trainee) ctx.getBean("trbean");
v.show();

	
	}
}



