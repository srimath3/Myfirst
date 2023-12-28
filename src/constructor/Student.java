package constructor;

public class Student {
	private int stuId;
	private String stuName;
	private String stuAddress;
	private String collegeName;
	public Student(int stuId, String stuName, String stuAddress) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAddress = stuAddress;
		this.collegeName = "NIT";
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Student(int stuId, String stuName, String stuAddress, String collegeName) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAddress = stuAddress;
		this.collegeName = collegeName;
	}
	

}
