package bankaFlilijale;
import java.sql.*;

public class DBBanka {

    String connectionString; 
    Connection connection;

    public DBBanka(String connectionString) {
        this.connectionString = connectionString;
    }


   
    void connect() throws SQLException {
        disconnect();
        connection = DriverManager.getConnection(connectionString);
    }

    private void disconnect() throws SQLException { 
        if (connection != null && !connection.isClosed())
            connection.close();
    }

    public void printBankFilijala() throws SQLException {

        try (Connection connection = DriverManager.getConnection(connectionString);
             Statement statement = connection.createStatement()) {
            final ResultSet resultSet = statement.executeQuery("SELECT Filijala.IdFil, Filijala.Naziv, Mesto.Naziv FROM  Filijala LEFT JOIN Mesto ON Filijala.IdMes=Mesto.IdMes");
       

            while (resultSet.next()) {  
                int idFil = resultSet.getInt(1);
                String FilNaziv = resultSet.getString(2);
                String MesNaziv = resultSet.getString(3);
                
               
               
                System.out.println(idFil + "\t" + FilNaziv + "\t" + MesNaziv );

    				
            }

        }

    }


    
}
