package hibernate1;

	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.OneToOne;
	import javax.persistence.Transient;

	import org.hibernate.annotations.Cascade;
	import org.hibernate.annotations.CascadeType;

	import lombok.Data;
	import lombok.Getter;
	import lombok.Setter;

	@Entity(name = "person_details")
	@Data
	public class person {
		@Id
		private String pName;
		@Transient
		private double salary;
		private int age;
		
		@OneToOne
		@Cascade(CascadeType.ALL)
		private pancard pc;
}
