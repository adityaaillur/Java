/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalMngmt;

import java.util.Objects;


/**
 *
 * @author adityaillur
 */
public class Doctor {
    
    public int docId;
    public String name;
    public String specialisation;
    public String username;
    public String password;
    public Hospital hospital;
    public String gender;

    public boolean verify(String username, String password){
       return this.username.equals(username) && this.password.equals(password);
    }

    public Doctor() {
    }

    public Doctor(int docId, String name, String specialisation, String username, Hospital hospital, String password, String gender ) {
        this.docId = docId;
        this.name = name;
        this.specialisation = specialisation;
        this.username = username;
        this.password = password;
        this.hospital = hospital;
        this.gender = gender;

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
    
    public Hospital getHospital() {
        return hospital;
    }
    
    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Doctor{" + "docId=" + docId + ", name=" + name + ", specialisation=" + specialisation + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Doctor other = (Doctor) obj;
        if (this.docId != other.docId) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.specialisation, other.specialisation);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.docId;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.specialisation);
        hash = 59 * hash + Objects.hashCode(this.username);
        hash = 59 * hash + Objects.hashCode(this.password);
        hash = 59 * hash + Objects.hashCode(this.hospital);
        return hash;
    }
    
    
    
}
