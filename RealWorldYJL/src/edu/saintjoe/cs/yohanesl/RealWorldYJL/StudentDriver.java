package edu.saintjoe.cs.yohanesl.RealWorldYJL;

public class StudentDriver {

	public static void main(String[] args) {
		// see what we can do about our class and students
		
		int studentCount = 0;
		
		Course cmp112 = new Course("CMP112A", "B. Capouch", "Core 125");
		
		Student nextStudent = new Student("Jared Alt", "M", 1, 19);
		// To put data into our private array we had to write a mutator
		// We passed it a filled-in Student record, and our "counter" which is studentCount
		cmp112.setStudent(nextStudent, studentCount++);
		//cmp112.students[studentCount++] = nextStudent;
		nextStudent = new Student("Jude Brace", "M", 1, 20);
		//cmp112.students[studentCount++] = nextStudent;
		cmp112.setStudent(nextStudent, studentCount++);
		nextStudent = new Student("Zach Bobos", "M", 1, 19);
		//cmp112.students[studentCount++] = nextStudent;
		cmp112.setStudent(nextStudent, studentCount++);
		nextStudent = new Student("Ylee", "M", 3, 21);
		cmp112.setStudent(nextStudent, studentCount++);
		System.out.println(cmp112.toString());
		// Add Yourself!!!
		

	}

}
