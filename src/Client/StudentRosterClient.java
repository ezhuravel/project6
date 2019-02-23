package Client;

import StudentRoster.*;

import java.rmi.Naming;

public class StudentRosterClient {

    public static void main(String[] args) {
        try{
            StudentRosterRemote roster = (StudentRosterRemote) Naming.lookup("rmi://localhost/StudentRoster");
            StudentMonitor monitor = new StudentMonitor(roster);

            String [] students = new String[]{"Mike", "John", "Ally", "Joel", "Michelle", "Bob"};

            monitor.setRoster(students);
            monitor.printRoster();
            monitor.removeStudent("Mike");
            monitor.printRoster();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
