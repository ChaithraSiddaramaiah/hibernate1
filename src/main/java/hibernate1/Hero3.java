package hibernate1;

	

	import java.util.Date;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Lob;

	import org.hibernate.annotations.CreationTimestamp;
	import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

	@Entity
	@Data
	public class Hero3 {
	@Id
	@GeneratedValue
	private int uId;
	@Column(nullable=false)
	private String uName;
	@Column(unique = true)
	private long uPhno;
	private double uSal;
	@CreationTimestamp
	private Date createdtimedate;
	@UpdateTimestamp
	private Date updatedtimedate;
	@Lob
	private byte[]image;

	}

	