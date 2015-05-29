package honeyy;

import org.hibernate.Session;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestClient {

	public TestClient() {
	}

	private Honey createHoney(Honey honey) {
		System.out.println("creating honey");
		Session session = HibernateSessionFactory.currentSession();
		Transaction tx = session.beginTransaction();
		Integer id = (Integer) session.save(honey);
		honey.setId(id);
		tx.commit();
		HibernateSessionFactory.closeSession();
		return honey;
	}

	private void updateHoney(Honey honey) {
		System.out.println("updating honey");
		Session session = HibernateSessionFactory.currentSession();
		Transaction tx = session.beginTransaction();
		Honey dbHoney = (Honey) session.get(Honey.class, honey.getId());
		if (honey != null) {
			dbHoney.setName(honey.getName());
			dbHoney.setTaste(honey.getTaste());
		}
		session.flush();
		tx.commit();
		HibernateSessionFactory.closeSession();
	}

	private void listHoney() {
		System.out.println("listing honey");
		Session session = HibernateSessionFactory.currentSession();
		Transaction tx = session.beginTransaction();
		List<?> honeys = session.createQuery("from Honey").list();
		for (Iterator<?> iter = honeys.iterator(); iter.hasNext();) {
			Honey honey = (Honey) iter.next();
			System.out
					.println("Id " + honey.getId() + " Name " + honey.getName());
		}
		tx.commit();
		HibernateSessionFactory.closeSession();
	}

	public static void main(String[] args) {
		 
		TestClient client = new TestClient();
		try {
			Honey honey = new Honey();
			honey.setName("favourite white");
			honey.setTaste("very sweet");
			honey = client.createHoney(honey);
			System.out.println("primary key is " + honey.getId());
			client.listHoney();
			honey.setName("greece forest");
			honey.setTaste("very good");
			client.updateHoney(honey);
			client.listHoney();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
