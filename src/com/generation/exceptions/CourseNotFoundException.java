package com.generation.exceptions;

	public class CourseNotFoundException extends Exception
{

    public CourseNotFoundException(String message)
    {
        super("course not found!![" + message + "]");
    }//constrcuctor
}//class StudentNotFoundException
