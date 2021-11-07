package util;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import entity.Kisi;
import entity.Telefon;

public class Test {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionfactory().openSession();
		session.beginTransaction();
		
		Kisi kisi = new Kisi("Aysel","Yemisli");
		
		Telefon tel1=new Telefon("0647352947","A fatural� hat");
		Telefon tel2=new Telefon("9400383927","B faturas�z hat");
		
		List<Telefon> telefonlar= new ArrayList();
		
		tel1.setKisi(kisi);
		tel2.setKisi(kisi);
		
		telefonlar.add(tel1);
		telefonlar.add(tel2);
		
		kisi.setTelefonNumaralari(telefonlar);
		
		session.save(kisi);
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println("Kay�t edildi");
		
		
		
		
		
	}

}
