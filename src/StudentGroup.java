import java.util.Date;
import java.util.*;
import java.IllegalArgumentException;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
		
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		int id,c=1;
		String name;
		double mark;
		Scanner s=new Scanner(System.in);
		try{
			
			if(students.length==null)
				throw IllegalArgumentException;
			else
			{
				for(int i=0;i<students.length;i++)
				{

					id=s.nextInt();
					name=s.next();
					mark=s.nextDouble();
					Date dob[i]= new Date(1997,if(c==12){c=1;}(c++)%12,(c++)%31);
					students[i]=new Student(id,name,dob[i],mark);
				}

			}
		}
		
      }

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		try{
		if(index<0||index>=students.length)
			throw IllegalArgumentException;
		}
		return students[index];
		
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		try{
		if(index<0||index>=students.length||student==null)
			throw IllegalArgumentException;
		else{
			students[index].id=student.id;
			students[index].fullname=student.fullname;
			students[index].birthDate=student.birthDate;
			students[index].avgMark=student.avgMark;

		}
		}
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		try{
		if(student==null)
			throw IllegalArgumentException;
		else{
		students=Arrays.copyOf(students,students.length+1);
			for(i=students.length-2;i>=0;i++)
			{
				students[i+1]=students[i];
			}
			students[0]=new Student(student.id,student.fullname,student.birthDate,student.avgMark);
	    }
      }  
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		try{
		if(student==null)
			throw IllegalArgumentException;
		else{
			students=Arrays.copyOf(students,students.length+1);
			students[students.length-1]=new Student(student.id,student.fullname,student.birthDate,student.avgMark);
			
		}
		}

	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		try{
		if(index<0||index>=students.length||student==null)
			throw IllegalArgumentException;
		else{
			students=Arrays.copyOf(students,students.length+1);
			for(i=students.length-2;i>=index;i++)
			{
				students[i+1]=students[i];
			}
			students[index]=new Student(student.id,student.fullname,student.birthDate,student.avgMark);
			
		}
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here

	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
