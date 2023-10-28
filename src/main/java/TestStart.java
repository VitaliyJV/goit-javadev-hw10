import service.ClientCrudService;
import service.HibernateUtil;
import service.PlanetCrudService;
import org.flywaydb.core.Flyway;

public class TestStart {
    public static void main(String[] args) {

        final String url = "jdbc:h2:./goit-javadev-hw10";
        final String user = "";
        final String password = "";

        Flyway flyway = Flyway.configure().dataSource(url, user, password).load();
        flyway.migrate();

        ClientCrudService clientCrudService = new ClientCrudService();
        PlanetCrudService planetCrudService = new PlanetCrudService();

        HibernateUtil.getInstance().close();
    }
}





