package hibernate1;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

	public class MainClass2 {
	public static void main(String[] args) throws IOException {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("monday");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Hero3 hero3=new Hero3();
	hero3.setUName("Ranju");
	hero3.setUPhno(88427462983l);
	hero3.setUSal(255325.34);
	FileInputStream fileInputStream=new FileInputStream("C:\\Users\\madhu\\Downloads\\WhatsApp Image 2024-11-04 at 3.08.44 PM (1).jpeg");
	byte[] arr=new byte[fileInputStream.available()];
	fileInputStream.read(arr);
	hero3.setImage(arr);
	entityTransaction.begin();
	entityManager.persist(hero3);
	entityTransaction.commit();
	// Hero3 h=entityManager.find(Hero3.class, 1);
	// h.setuName("Raju");
	// entityTransaction.begin();
	// entityManager.persist(hero3);
	// entityTransaction.commit();

	}
}


