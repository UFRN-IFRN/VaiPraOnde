
package Telas;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    
    public Connection doConnection() {
       Connection conn = null;
        try {
            String url      = "jdbc:mysql://localhost:3306/vai_pra_onde";
            String usuario  = "root";
            String senha    = "";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,usuario,senha);
            System.out.println("Success!!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;
    }
}