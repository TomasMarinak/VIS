

import com.project.gateway.PaymentGateway;
import com.project.gateway.SeatGateway;
import com.project.models.Enums.EPayment;
import com.project.models.Payment;

import java.sql.*;
import java.util.Set;

public class Application {
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/theatre";

    //  Database credentials
    static final String USER = "postgres";
    static final String PASSWORD = "1234";

    public  static  void  main(String[]args){



        try(Connection con = DriverManager.getConnection(
                DB_URL,USER,PASSWORD)){
            Class.forName(JDBC_DRIVER);

            final PaymentGateway paymentGateway = new PaymentGateway(con);
            final SeatGateway seatGateway= new SeatGateway(con );
            seatGateway.delete(1l);
         //
           //   paymentGateway.save(new Payment(3L, EPayment.DURING,25645.502,"USD",1L));



        }catch(Exception e){ System.out.println(e);}
    }
}
