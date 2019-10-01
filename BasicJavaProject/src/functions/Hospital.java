package functions;

public class Hospital {
	
	public String patientType;
	public String doctorName;
	public String speciality;
	public int numofBed;
	public int numOfDoctors;
	public String hospitalName;
	
	
	public void treatment()
	{
		System.out.println("Patients with the "+patientType+" will be sent to the "+speciality+" doctor "+doctorName);
	}
	
	public void capacity()
	{
		System.out.println(hospitalName+" hospital has "+numofBed+" beds and "+numOfDoctors+" doctors");
	}
	//default Constructor4
	public Hospital()
    {
    	
    }
    public Hospital(String patientType,String doctorName,String speciality,int numofBed,int numOfDoctors,String hospitalName)
    {
    	this.patientType=patientType;
    	this.doctorName=doctorName;
    	this.speciality=speciality;
    	this.numofBed=numofBed;
    	this.numOfDoctors=numOfDoctors;
    	this.hospitalName=hospitalName;
    }
    
} 






