/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalMngmt;

/**
 *
 * @author adityaillur
 */
public class VitalSigns {
    private double BloodPressure;
    private double Temperature;
    private float Height;
    private float Weight;
    private int Heartbeat;
    private int RespiratoryRate;
    
    public VitalSigns(double BloodPressure, double Temperature, float Height, float Weight, int Heartbeat, int RespiratoryRate){
    
    this.BloodPressure = BloodPressure;
    this.Heartbeat = Heartbeat;
    this.Height = Height;
    this.Weight = Weight;
    this.RespiratoryRate = RespiratoryRate;
    this.Temperature = Temperature;
    }

    public double getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(double BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public double getTemperature() {
        return Temperature;
    }

    public void setTemperature(double Temperature) {
        this.Temperature = Temperature;
    }

    public float getHeight() {
        return Height;
    }

    public void setHeight(float Height) {
        this.Height = Height;
    }

    public float getWeight() {
        return Weight;
    }

    public void setWeight(float Weight) {
        this.Weight = Weight;
    }

    public int getHeartbeat() {
        return Heartbeat;
    }

    public void setHeartbeat(int Heartbeat) {
        this.Heartbeat = Heartbeat;
    }

    public int getRespiratoryRate() {
        return RespiratoryRate;
    }

    public void setRespiratoryRate(int RespiratoryRate) {
        this.RespiratoryRate = RespiratoryRate;
    }
    
    
    
}

