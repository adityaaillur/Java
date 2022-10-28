/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalMngmt;

import java.util.ArrayList;

/**
 *
 * @author adityaillur
 */
public class DoctorDirectory {
    
    ArrayList<Doctor> directory;

    public DoctorDirectory(ArrayList<Doctor> directory) {
        this.directory = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Doctor> directory) {
        this.directory = directory;
    }
    
    public Doctor addNewDoctor(){
        Doctor doc = new Doctor();
        directory.add(doc);
        return doc;
    }
    
    
}
