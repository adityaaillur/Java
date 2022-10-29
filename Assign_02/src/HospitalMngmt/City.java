/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalMngmt;

/**
 *
 * @author adityaillur
 */
public class City {
    private String name;
    private int zipcode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public City(String name, int zipcode) {
        this.name = name;

        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "City{" + "name=" + name + ", zipcode=" + zipcode + '}';
    }
    
    

 
    
    
    
}
