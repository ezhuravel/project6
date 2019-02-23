package StudentRoster;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface StudentRosterRemote extends Remote {
    ArrayList<String> getStudents()  throws RemoteException;
    void addStudent(String name)  throws RemoteException;
    void deleteStudent(String name)  throws RemoteException;
}
