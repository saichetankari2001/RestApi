package My_personal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoProjectApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MobilesConfig.class);
		
		
		Mobiles obj = context.getBean("getIphoneobject",Mobiles.class);
		obj.getmodelandcolour(); 
		
	}

}
