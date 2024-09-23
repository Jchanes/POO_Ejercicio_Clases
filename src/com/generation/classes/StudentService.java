package com.generation.classes;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.generation.exceptions.CourseNotFoundException;
import com.generation.exceptions.StudentNotFoundException;

public class StudentService
{
    HashMap<String, Course> courseList = new HashMap<>();

    HashMap<String, Student> students = new HashMap<>();

	HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();
	
    public HashMap<String, Student> getStudents() {
		return students;
	}//getStudents
    
	public void setStudents(HashMap<String, Student> students) {
		this.students = students;
	}//setStudents
	
    public StudentService()
    {
        courseList.put( "Math", new Course( "Math", 10, "Aurelio Baldor" ) );
        courseList.put( "Physics", new Course( "Physics", 10, "Albert Einstein" ) );
        courseList.put( "Art", new Course( "Art", 10, "Pablo Picasso" ) );
        courseList.put( "History", new Course( "History", 10, "Sima Qian" ) );
        courseList.put( "Biology", new Course( "Biology", 10, "Charles Darwin" ) );
    }

    public void enrollStudents( String courseName, String studentID )throws CourseNotFoundException, StudentNotFoundException{
        Course course = courseList.get( courseName );
        
        if(! courseList.containsKey(courseName)){
        	throw new StudentNotFoundException(studentID);
        }

        if ( !coursesEnrolledByStudents.containsKey( studentID ) )
        {
            coursesEnrolledByStudents.put( studentID, new ArrayList<>() );
        }
        coursesEnrolledByStudents.get( studentID ).add( course );
    }//enrollStudents

    public void unEnrollStudents( String courseName, String studentID )
    {
        Course course = courseList.get( courseName );

        if ( coursesEnrolledByStudents.containsKey( studentID ) )
        {
            coursesEnrolledByStudents.get( studentID ).remove( course );
        }
    }//unEnrollStudents

    public void showEnrolledStudents(String courseId){
        //TODO implement using collections loops
    	Course course = courseList.get(courseId);
    	
    	for (String studentId : coursesEnrolledByStudents.keySet()) {
			List<Course> allCourse = coursesEnrolledByStudents.get(studentId);
			if(allCourse.contains(course)){
				Student student = students.get(studentId);
				System.out.println(student);
			}//if
		}//forEach
    }//showEnrolledStudents
    	

    public void showAllCourses(){
        //TODO implement using collections loops
    	for (Course course : courseList.values()) {
			System.out.println(course);
		}//foreach
    	
//    	otra forma de hacerlo
//    	for (String key : courseList.keySet()) {
//			System.out.println(courseList.get(key));
//		}//foreach
    	
    }//showAllCourses
}
