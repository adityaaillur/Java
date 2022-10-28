/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalMngmt;

/**
 *
 * @author adityaillur
 */
public class Person {
    private String name;
    private int pid;
    private String gender;
    private String role;
    private String community;
    
    public Person() {
    }
    
    public Person(int pid, String name, String gender, String role, String community) {
        this.pid = pid;
        this.name = name;
        this.gender = gender;
        this.role = role;
        this.community = community;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
}

