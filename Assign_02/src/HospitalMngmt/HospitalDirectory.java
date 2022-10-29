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
public class HospitalDirectory {
    
    public ArrayList<Hospital> directory;

    public HospitalDirectory(ArrayList<Hospital> directory) {
        this.directory = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Hospital> directory) {
        this.directory = directory;
    }
    
}
