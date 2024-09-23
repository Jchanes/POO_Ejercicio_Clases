package com.generation.main;

import com.generation.classes.Student;
import com.generation.classes.StudentService;
import com.generation.exceptions.CourseNotFoundException;
import com.generation.exceptions.StudentNotFoundException;

public class Main {

    public static void main(String[] args) {
	    StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService
        studentService.getStudents().put( "1030", new Student( "Carlos", "1030", 31 ) );
        studentService.getStudents().put( "1040", new Student( "Ian", "1040", 28 ) );
        studentService.getStudents().put( "1050", new Student( "Elise", "1050", 26 ) );
        studentService.getStudents().put( "1020", new Student( "Santiago", "1020", 33 ) );
        try {
			studentService.enrollStudents( "Math", "1030" );
		} catch (CourseNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        studentService.showEnrolledStudents("Math");
    }//main
}//class Main
