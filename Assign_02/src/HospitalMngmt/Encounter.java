/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalMngmt;

/**
 *
 * @author adityaillur
 */
public class Encounter {
    
    public Doctor doctor;
    public Patient patient;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Encounter(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
    }
}
