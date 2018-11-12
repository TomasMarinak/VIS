

import com.project.config.SQLConnection;
import com.project.gateway.PaymentGateway;
import com.project.gateway.SeatGateway;
import com.project.gateway.UserGateway;
import com.project.models.Enums.EPayment;
import com.project.models.Enums.ESeat;
import com.project.models.Enums.EUser;
import com.project.models.Payment;
import com.project.models.User;

import java.sql.*;

public class Application {
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/theatre";

    //  Database credentials
    static final String USER = "postgres";
    static final String PASSWORD = "1234";

    public  static  void  main(String[]args) throws SQLException {


        Connection connection = SQLConnection.getConnection();

            final PaymentGateway paymentGateway = new PaymentGateway(connection);
            final SeatGateway seatGateway= new SeatGateway(connection );
            final UserGateway userGateway = new UserGateway(connection,"users");
          //  userGateway.save(1L,EUser.CUSTOMER,"Peter","Maly","peter.maly@maly.com","U velkeho Petra 28, Zlin");
          // paymentGateway.save(5L, EPayment.DURING,29.6 ,"EUR",1L);
            ResultSet rsl = userGateway.findAll();
            while(rsl.next()){
               // System.out.println("ID: "+rsl.getLong(1)+" State: "+rsl.getString(2)+" Amount: "+rsl.getDouble(3));
                System.out.println("ID: "+rsl.getLong(1)+" Role: "+rsl.getString(2)+" Name: "+rsl.getString(3) +rsl.getString(4)+" LastName: " +rsl.getString(5)+" Email: "+rsl.getString(6));
            }
          //  paymentGateway.find(3L);
         //
           //   paymentGateway.save(new Payment(3L, EPayment.DURING,25645.502,"USD",1L));




    }
}
