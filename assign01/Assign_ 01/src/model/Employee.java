/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author adityaillur
 */
public class Employee {
    private String name;
    private String empID;
    private String age;
    private String stDt;
    private String lvl;
    private String teamInfo;
    private String posTitl;
    private String email;
    private String gen;
    private String pic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpID() {
        return empID;
    }

    public void setempID(String empID) {
        this.empID = empID;
    }

    public String getAge() {
        return age;
    }

    public void setage(String age) {
        this.age = age;
    }

    public String getstDt() {
        return stDt;
    }

    public void setstDt(String stDt) {
        this.stDt = stDt;
    }
    
     public String getteamInfo() {
        return teamInfo;
    }

    public void setteamInfo(String teamInfo) {
        this.teamInfo = teamInfo;
    }
    
     public String getposTitl() {
        return posTitl;
    }

    public void setposTitl(String posTitl) {
        this.posTitl = posTitl;
    }
    
     public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }
    
     public String getlvl() {
        return lvl;
    }

    public void setlvl(String lvl) {
        this.lvl = lvl;
    }
    
     public String getgen() {
        return gen;
    }

    public void setgen(String gen) {
        this.gen = gen;
    }
    
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", empID=" + empID + ", age=" + age + ", stDt=" + stDt + ", lvl=" + lvl + ", teamInfo=" + teamInfo + ", posTitl=" + posTitl + ", email=" + email + ", gen=" + gen + '}';
    }
    
    
}
