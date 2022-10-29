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
    
    private String hospitalName;
    private String username;
    private String password;
    private Community community;

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
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

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public Hospital(String hospitalName, String username, String password, Community community) {
        this.hospitalName = hospitalName;
        this.username = username;
        this.password = password;
        this.community = community;
    }
}
