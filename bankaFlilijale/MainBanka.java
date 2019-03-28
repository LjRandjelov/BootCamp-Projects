package bankaFlilijale;

import java.sql.SQLException;
import java.util.Scanner;

import bankaFlilijale.DBBanka;
import bankaFlilijale.DBConfig;

public class MainBanka {
public static void main(String[] args) {
		
		DBBanka database = new DBBanka("jdbc:sqlite:"+DBConfig.dbLocalBank);
        Scanner sc = new Scanner(System.in);

        try {
            database.printBankFilijala();

 
            }catch (Exception e){
                System.out.println(e.getMessage());
                
            }
           


	}
}

