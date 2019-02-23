package Server;

import StudentRoster.*;
import java.rmi.Naming;

public class StudentRosterServer {
    public static void main(String[] args) {

        try{
            StudentRosterRemote studentRoster = new StudentRoster();
            Naming.rebind("//localhost/StudentRoster", studentRoster);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
