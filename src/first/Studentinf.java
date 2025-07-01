package first;

 class StudentInfo {
	 
	private int studentId;
	private String name;
	private float qualifyingExamMarks ;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public float getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}
	
	public void setQualifyingExamMarks(float qualifyingExamMarks) {
		if (qualifyingExamMarks >= 65 && qualifyingExamMarks >=100 )
		{
			this.qualifyingExamMarks = qualifyingExamMarks;
		}
		else
		{
			System.out.println("You are not qualified, your score is only "+ qualifyingExamMarks );
		}
			
	}
	public char getResidentialStatus() {
		return residentialStatus;
	}
	public void setResidentialStatus(char residentialStatus) {
		if(residentialStatus == 'H' || residentialStatus == 'D')
		{
		this.residentialStatus = residentialStatus;
		}
		else
		{
			System.out.println(" The entered value "+residentialStatus+"is not valid" );
		}
	}
	public int getYearOfEngg() {
		return yearOfEngg;
	}
	public void setYearOfEngg(int yearOfEngg) {
		this.yearOfEngg = yearOfEngg;
	}
	private char residentialStatus;
	private int yearOfEngg ;
	
 }
 public class Studentinf{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo s1 = new StudentInfo();
		s1.setStudentId(1);
		s1.setName("sravani");
		s1.setQualifyingExamMarks(25);
		s1.setResidentialStatus('S');
		s1.setYearOfEngg(3);
		System.out.println(s1.getName());
		System.out.println(s1.getQualifyingExamMarks());
		System.out.println(s1.getResidentialStatus());
		System.out.println(s1.getStudentId());
		System.out.println(s1.getYearOfEngg());
		
	}

}
