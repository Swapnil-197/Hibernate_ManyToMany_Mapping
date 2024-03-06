package com.tka.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.tka.util.HibernateUtil;

public class AppTest {
	
	//private static final Logger log = LogManager.getLogger(AppTest.class);
	
	public static void main(String[] args) {
		
		try(Session session = HibernateUtil.getMysqlConnection().openSession()){
			
			Transaction tx = session.beginTransaction();
			
			
			tx.commit();
			
			System.out.println("Done"); 
			
		} catch (Exception e) {
			
			System.out.println("Error while insertion");
			e.printStackTrace();
		}
	}

}
