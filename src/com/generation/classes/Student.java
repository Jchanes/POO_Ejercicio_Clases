package com.generation.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student
{
    public String name;


	public String id;

    public int age;

    public final List<Course> courseList = new ArrayList<>();

    public Student( String name, String id, int age)
    {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    
    @Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + ", courseList=" + courseList + "]";
	}
}
