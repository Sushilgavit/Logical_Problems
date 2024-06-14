"# Logical_Problems" 

Welcome to my GitHub repository! Here, you'll find a collection of logical questions that are designed to help you prepare for your upcoming interview rounds. These questions cover a wide range of topics and are carefully curated to enhance your problem-solving skills and analytical thinking abilities. Whether you're gearing up for technical interviews or simply looking to sharpen your logical reasoning, you'll find valuable resources here to aid you in your preparation. Feel free to explore, contribute, and make the most out of these resources to excel in your interview journey. Happy coding and best of luck with your interviews!



package com.canvas.web.masters.countryMaster.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name="EMPLOYEE_NEW_150923")
public class LtEmployee implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@Column(name="EMPLOYEE_ID")
	private int employeID;

	
	@Column(name="FIRST_NAME")
	private String firstname;
	
	
	@Column(name="LAST_NAME")
	private String lastname;
	
	@Column(name = "DEPARTMENT")
	private String department;
	
	@Column(name = "LOCATION")
	private String location;
	
	@Column(name = "AGE")
	private int age ;
	
	@Column(name="PHONE_NO")
	private int phoneno ;
	
	@Column(name =" GENDER")
	private String gender;
	
	@Column(name = "EMPLOYEE_IMAGES")
	private byte [] employeeimages ;

	@OneToMany(mappedBy = "LtEmployeeStatus" , fetch = FetchType.EAGER , cascade = CascadeType.ALL)
	@MapKey (name ="employeeID")
	private List<LtEmployeeStatus>  ltEmployeeStatus ;
	
	
	public int getEmployeID() {
		return employeID;
	}

	public void setEmployeID(int employeID) {
		this.employeID = employeID;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public byte[] getEmployeeimages() {
		return employeeimages;
	}

	public void setEmployeeimages(byte[] employeeimages) {
		this.employeeimages = employeeimages;
	}
	
	
	

}
---------------------------------------------------------------------

package com.canvas.web.masters.countryMaster.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="EMPLOYEE_STATUS")
public class LtEmployeeStatus implements Serializable {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@Column(name="SNO")
	private int employeID;

	
	@Column(name="CREATION_TIME")
	private String creationTime;
	
	
	@Column(name="MODIFICATION_BY")
	private String modificationBy;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "REMARK")
	private String remark;
	
	@Column(name = "EMPLOYEE_ID")
	private int employeeID ;
	
	@ManyToOne(cascade = {CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinColumn(name="EMPLOYEE_ID",  insertable = false, updatable = false)
	private LtEmployee ltEmployee;
	
}

