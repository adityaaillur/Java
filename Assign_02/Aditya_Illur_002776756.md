# Aditya_Illur_002776756
## Hospital_Management_System README File


This project is on Hospital Management.
Its an application based on the given model with Java swing.  

- ✨ Project:✨       

## Features

- Patients are able to look for a doctor under the near hospitals
- Doctors are able to diagnose and leave encounter record based on vital signs 
- Encounter represent a visit to the doctor’s office. The vital signs timeline is linked to the encounters. 
- Each Encounter has a single Vital Sign component.
- Community admins are able to modify the information under a community 
- System admin have all access(CRUD) to all resources in this application

This application is a platform for people to find medical resource in different city and community. It manages the Person(Doctors, Patients, Community Admins) with all CRUD operations. 

> Assignment 2 AED 5100


This text you see here is *actually- written in Markdown! To get a feel
for Markdown's syntax, type some text into the left window and
watch the results in the right.

## Classes:

Used to create variables, constructors and Array Lists

- [Doctor Class] -
public int docId;
    public String name;
    public String specialisation;
    public String username;
    public String password;
    public Hospital hospital;
    public String gender;

- [City Class] - 
private String name;
    private int zipcode;

- [Community Class] - 
private String name;
    private City city;
    private String username;
    private String password;

- [Hospital Class] - 
 private String hospitalName;
    private String username;
    private String password;
    private Community community;

- [House Class] - 
 public int houseNumber;
    public Community community;

- [Patient Class] - 
public String username;
   public String password;
   public String name;
   public String gender;
   public String city;
   public String community;
   public int patientID;

- [Encounter Class] - 
  public Doctor doctor;
    public Patient patient;
    public String vitalSigns;

- [Array Lists] -
public static ArrayList<Doctor> doctorList = new ArrayList<>();
    public static ArrayList<Patient>  patientList = new ArrayList<>();
    public static ArrayList<Hospital>  hospitalList = new ArrayList<>();
    public static ArrayList<Community>  communityList = new ArrayList<>();
    public static ArrayList<House>  houseList = new ArrayList<>();
    public static ArrayList<Encounter>  encounterList = new ArrayList<>();
    public static ArrayList<City>  cityList = new ArrayList<>()

## Class Diagram:
@startuml

!theme plain
top to bottom direction
skinparam linetype ortho

class City {
  + City(String, int): 
  - name: String
  - zipcode: int
  + toString(): String
   name: String
   zipcode: int
}
class Community {
  + Community(String, City): 
  - name: String
  - city: City
  - username: String
  - password: String
  + toString(): String
   name: String
   password: String
   username: String
   city: City
}
class Doctor {
  + Doctor(): 
  + Doctor(int, String, String, String, Hospital, String, String): 
  + password: String
  + username: String
  + gender: String
  + specialisation: String
  + docId: int
  + name: String
  + hospital: Hospital
  + equals(Object): boolean
  + hashCode(): int
  + toString(): String
  + verify(String, String): boolean
   name: String
   password: String
   gender: String
   specialisation: String
   hospital: Hospital
   username: String
   docId: int
}
class DoctorDirectory {
  + DoctorDirectory(ArrayList<Doctor>): 
  ~ directory: ArrayList<Doctor>
  + addNewDoctor(): Doctor
   directory: ArrayList<Doctor>
}
class Encounter {
  + Encounter(Doctor, Patient): 
}
class EncounterHistory {
  + EncounterHistory(): 
}
class Hospital {
  + Hospital(String, String, String, Community): 
  - hospitalName: String
  - username: String
  - password: String
  - community: Community
  + verify(String, String): boolean
   hospitalName: String
   community: Community
   password: String
   username: String
}
class HospitalDirectory {
  + HospitalDirectory(ArrayList<Hospital>): 
  + directory: ArrayList<Hospital>
   directory: ArrayList<Hospital>
}
class House {
  + House(int, Community): 
  + community: Community
  + houseNumber: int
   community: Community
   houseNumber: int
}
class Patient {
  + Patient(int, String, String, String, String, String, String): 
  + verify(String, String): boolean
}
class PatientDirectory {
  + PatientDirectory(): 
}
class Person {
  + Person(): 
  + Person(int, String, String, String, String): 
  - name: String
  - gender: String
  - role: String
  - pid: int
   name: String
   gender: String
   pid: int
   role: String
}
class PersonDirectory {
  + PersonDirectory(): 
}
class SystemAdmin {
  + SystemAdmin(): 
}
class VitalSigns {
  + VitalSigns(double, double, float, float, int, int): 
  - Temperature: double
  - Heartbeat: int
  - Weight: float
  - RespiratoryRate: int
  - BloodPressure: double
  - Height: float
   Height: float
   RespiratoryRate: int
   BloodPressure: double
   Temperature: double
   Weight: float
   Heartbeat: int
}

Community         "1" *-[#595959,plain]-> "city\n1" City              
Doctor             -[#595959,dashed]->  Doctor            
Doctor            "1" *-[#595959,plain]-> "hospital\n1" Hospital          
DoctorDirectory    -[#595959,dashed]->  Doctor            : "«create»"
Encounter         "1" *-[#595959,plain]-> "doctor\n1" Doctor            
Encounter         "1" *-[#595959,plain]-> "patient\n1" Patient           
Hospital          "1" *-[#595959,plain]-> "community\n1" Community         
HospitalDirectory  -[#595959,dashed]->  Hospital          
House             "1" *-[#595959,plain]-> "community\n1" Community         
SystemAdmin        -[#595959,dashed]->  City              : "«create»"
SystemAdmin        -[#595959,dashed]->  Community         
SystemAdmin        -[#595959,dashed]->  Doctor            
SystemAdmin        -[#595959,dashed]->  Encounter         
SystemAdmin        -[#595959,dashed]->  Hospital          
SystemAdmin        -[#595959,dashed]->  House             
SystemAdmin        -[#595959,dashed]->  Patient           
@enduml
