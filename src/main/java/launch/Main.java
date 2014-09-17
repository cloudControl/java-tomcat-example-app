package launch;
import java.io.File;
import org.apache.catalina.startup.Tomcat;

public class Main {

    public static void main(String[] args) throws Exception {
        String port = System.getenv("PORT") != null ? System.getenv("PORT") : "8080";

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(Integer.valueOf(port));
        tomcat.addWebapp("/", new File("src/main/webapp/").getAbsolutePath());

        tomcat.start();
        tomcat.getServer().await();
    }
}
