package edu.saintjoe.cs.yohanesl.RealWorldYJL;

public class StudentDriver {

	public static void main(String[] args) {
		// see what we can do about our class and students
		
		int studentCount = 0;
		
		Course cmp112 = new Course("CMP112A", "B. Capouch", "Core 125");
		
		Student next Student = new Student("Jared Alt", "M", 1, 19);
		cmp112.students[studentCount++] = nextStudent;
		nextStudent = new Student("Jude Brace"' "M", 1, 20);
		cmp112.students[studentCount++] = nextStudent;
		nextStudent = new Student("Zach Bobos", "M", 1, 19);
		cmp112.students[studentCount++] = nextStudent;
		System.out.print(ln(cmp112.toString());
		

	}

}
