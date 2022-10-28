/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalMngmt;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author adityaillur
 */
public class Hospital {
    
    private int hospitalId;
    private String name;
    private Community community;
    List<Doctor>doctors;

    public Hospital() {
    }
    
    public Hospital(int hospitalId, String name) {
        this.hospitalId = hospitalId;
        this.name = name;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
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
        final Hospital other = (Hospital) obj;
        if (this.hospitalId != other.hospitalId) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Hospital{" + "hospitalId=" + hospitalId + ", name=" + name + '}';
    }
    
}
