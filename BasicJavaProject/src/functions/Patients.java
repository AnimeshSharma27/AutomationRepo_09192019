package functions;

public class Patients {

	public static void main(String[] args) {
		
		Hospital hospital1= new Hospital();
		
		
		hospital1.hospitalName="Noble";
		hospital1.patientType="Bone injury";
		hospital1.speciality="Orthopedic";
		hospital1.doctorName="Dr. Sharma";
		hospital1.numofBed=100;
		hospital1.numOfDoctors=10;
		
		hospital1.treatment();
		
		hospital1.capacity();
		
		Hospital hospital2= new Hospital();
		
		hospital2.hospitalName="Columbia Asia";
		hospital2.patientType="cancer";
		hospital2.speciality="Oncologist";
		hospital2.doctorName="Dr. Batra";
		hospital2.numofBed=50;
		hospital2.numOfDoctors=5;
        hospital2.treatment();
		
		hospital2.capacity();
	
		Hospital hospital3= new Hospital("Tooth Ache","Manohar","Dentist",1000,100,"City Hospital");
		
		hospital3.treatment();
		hospital3.capacity();
		

	}

}
