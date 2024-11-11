package hibernate1;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

	public class Mainclass {
		public static void main(String[] args) {
			EntityManagerFactory e = Persistence.createEntityManagerFactory("monday");
			EntityManager m = e.createEntityManager();
			EntityTransaction t = m.getTransaction();
	//-----------------insertion---------------		
			pancard pc=new pancard();
			pc.setAddress("tumkur");
			pc.setPNo("125yuwter74");
			
			person p=new person();
			p.setAge(27);
			p.setPName("ramesh");
			p.setSalary(2.255);
			p.setPc(pc);
			
			
			t.begin();
			m.persist(p);
			t.commit();
			
	//--------------fetching child class------------	
//			PanCard pc = m.find(PanCard.class, "12tqweu35");
//			System.out.println(pc);
	//---------------fetching parent class----------		
//			Person p = m.find(Person.class, "umesh");
//			System.out.println(p);
	//--------------updating child class------------		
//			PanCard pc = m.find(PanCard.class, "12tqweu35");
//			pc.setAddress("bengaluru");	
//			t.begin();
			//m.merge(pc);
//			t.commit();
	//----------------updating parent class-----------		
//			Person p = m.find(Person.class, "umesh");
//			p.setAge(50);
//			t.begin();
//			m.merge(p);
//			t.commit();
	//-----------------deleting parent class------------	
//			Person p = m.find(Person.class, "umesh");
//			t.begin();
//			m.remove(p);
//			t.commit();
	//-----------deleting child class-----------
	//to delete child class first we have to break the relationship(set foreign key as null)
	//-----------------1.making foreign key as null----------
//			Person p = m.find(Person.class, "umesh");
//			p.setPc(null);
//			t.begin();
//			m.merge(p);
//			t.commit();
	//----------------2.deleting child class----------
//			PanCard pc = m.find(PanCard.class, "12tqweu35");
//			t.begin();
//			m.remove(pc);
//			t.commit();
		}
	}
