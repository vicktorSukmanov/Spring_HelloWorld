import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class  App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat1.getSay());

        Cat beanCat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat2.getSay());

        System.out.println(bean==bean1);
        System.out.println(beanCat1==beanCat2);
    }
}