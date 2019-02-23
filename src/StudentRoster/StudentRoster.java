package StudentRoster;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class StudentRoster extends UnicastRemoteObject implements StudentRosterRemote {
    private ArrayList<String> students;

    public StudentRoster() throws RemoteException {
        students = new ArrayList<>();
    }

    @Override
    public ArrayList<String> getStudents() {
        return students;
    }

    @Override
    public void addStudent(String name) {
        students.add(name);
    }

    @Override
    public void deleteStudent(String name) {
        students.remove(name);
    }
}