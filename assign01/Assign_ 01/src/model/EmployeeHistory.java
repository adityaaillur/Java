/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author adityaillur
 */
public class EmployeeHistory {
    public ArrayList<Employee> history;
    
    public EmployeeHistory(){
         this.history = new ArrayList<Employee>(); 
        
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    
    public Employee addNewEmployee(){
        
        Employee newEmployee = new Employee();
        history.add(newEmployee);
        return newEmployee;
    }
    
    public void deleteEmployee(Employee eh) {
        for(int i=0;i<history.size();i++){
            if(history.get(i).equals(eh)){
                history.remove(eh);
            }
        }
        
    }
    

}
