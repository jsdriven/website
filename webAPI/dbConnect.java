import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnect{

    private final String user ="rrtvtwrxcmrxpl";
    private final String pass ="1c142af3b64a2f07cd195cd9de69c0fff895f1054fcfce7f2d42447f390e8a39";
    private final String url ="ec2-54-86-170-8.compute-1.amazonaws.com:5432/dou2uh35hjon0";

    public Connection connect(){
        Connection conn = null;
        try{
            conn =  DriverManager.getConnection(url,user,pass);
            System.out.println("ConnectedSuccessfully");
        }catch(SQLException e ){
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args){
        dbConnect test = new dbConnect();
        Connection conn = test.connect();
        try{
            conn.close();
            System.out.println("Closed");
        }catch(SQLException e ){
            System.out.println(e.getMessage());
        }
        
    }

}