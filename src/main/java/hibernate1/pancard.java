package hibernate1;


	import javax.persistence.Entity;
	import javax.persistence.Id;

	import lombok.Data;

	@Entity
	@Data
	public class pancard {
		@Id
		private String pNo;
		private String address;
		
	}

