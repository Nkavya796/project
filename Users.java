import java.util.Date;

public class Users {
int empId;
private String name;
private Date dob;
private String Address;
private String Qualification;
private String emailid;
private String contactnumber;
private String Department;
private String Supervicer;
private Skills s;
static int id=100;
public Users() {
	this.empId=empId++;
}

public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getQualification() {
	return Qualification;
}
public void setQualification(String qualification) {
	Qualification = qualification;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getContactnumber() {
	return contactnumber;
}
public void setContactnumber(String contactnumber) {
	this.contactnumber = contactnumber;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
public String getSupervicer() {
	return Supervicer;
}
public void setSupervicer(String supervicer) {
	Supervicer = supervicer;
}
public Skills getS() {
	return s;
}
public void setS(Skills s) {
	this.s = s;
}


}
