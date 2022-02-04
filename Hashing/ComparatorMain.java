package comparator.com;

import java.util.Scanner;
import java.util.TreeSet;

public class ComparatorMain {
public static void main(String[] args) {
	Student std1 = new Student(9,"AAAA","BBBB",50);
	Student std2 = new Student(2,"DDDD","BBBB",50);
	Student std3 = new Student(8,"EEEE","BBBB",34);
	Student std4 = new Student(6,"BBBB","AAAA",90);
	Student std5 = new Student(3,"CCCC","AAAA",50);
	Student std6 = new Student(10,"AAAA","BBBB",50);
	System.out.println("Enter Sorting Option");
	System.out.println("1.id");
	System.out.println("2.name");
	System.out.println("3.qual");
	System.out.println("4.marks");
	
	Scanner sc = new Scanner(System.in);
	int op = sc.nextInt();
	TreeSet<Student>set = null;
	
	switch(op) {
	case 1: set = new TreeSet<>(new StudentIdComparator());break;
	case 2: set = new TreeSet<>(new StudentNameComparator());break;
	case 3:set = new TreeSet<>(new StudentQualComparator());break;
	default:set = new TreeSet<>(new StudentMarksComparator());break;
	}
	set.add(std1);
	set.add(std2);
	set.add(std3);
	set.add(std4);
	set.add(std5);
	set.add(std6);
	System.out.println(set);
}
}
