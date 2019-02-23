package Client;

import StudentRoster.*;

import java.util.ArrayList;

public class StudentMonitor {
    StudentRosterRemote studentRoster;

    public StudentMonitor(StudentRosterRemote st){
        studentRoster = st;
    }

    public void setRoster(String[] students){
        try{
            for(int i =0; i < students.length; i++){
                studentRoster.addStudent(students[i]);
            }

            System.out.println("Student roster set");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void removeStudent(String student){
        try
        {
            studentRoster.deleteStudent(student);
            System.out.println(student + " Has been removed from roster");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void printRoster(){
        try{
            ArrayList<String> students = studentRoster.getStudents();

            for(int i = 0; i< students.size(); i++){
                System.out.println(students.get(i));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
