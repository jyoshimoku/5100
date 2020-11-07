package hw7;

import java.util.ArrayList;

public class HospitalRoom {
	ArrayList<Doctor> dList= new ArrayList<>();
	ArrayList<Patient> pList= new ArrayList<>();
	 Object lock1 = new Object();
	 Object lock2 = new Object();
	public boolean doctorEnter(Doctor d) throws InterruptedException {
        if (dList.size()==0) {
			return true;
		}
        return false;
    }

    public boolean doctorLeave(Doctor d) throws InterruptedException {
    	if (dList.contains(d)) {
			return false;
		}
        return true;
    }

    public boolean patientEnter(Patient p) throws InterruptedException {
    	if (pList.size()<3) {
			return true;
		}
        return false;
    }

    public boolean patientLeave(Patient p) throws InterruptedException {
    	if (pList.contains(p)) {
			return false;
		}
        return true;
    }
    
    public void add(Doctor d) {
		dList.add(d);
	}
    public void remove(Doctor d) {
		dList.remove(d);
	}
    public void add(Patient d) {
		pList.add(d);
	}
    public void remove(Patient d) {
		pList.remove(d);
	}
    public int getdlistSize() {
		return dList.size();
	}
    public int getplistSize() {
		return pList.size();
	}
    
}

class Doctor {
    public String name;
    public Doctor(String name) {
        this.name = name;
    }
    
//    public synchronized void add(HospitalRoom room) {
//    	room.add(this);
//    	System.out.println(String.format("Doctor %s Entered, number of doctor %d", this.name,room.getdlistSize()));
//    }
//    public synchronized void remove(HospitalRoom room) {
//    	room.remove(this);
//    	System.out.println(String.format("Doctor %s Left, number of doctor %d", this.name,room.getdlistSize()));
//	}
    
}

class Patient {
    public String name;
    public Patient(String name) {
        this.name = name;
    }
}

class Main2 {
    public static void main(String[] args) {
        HospitalRoom room = new HospitalRoom();
        Doctor siva = new Doctor("siva");
        Doctor john = new Doctor("john");
        Patient p1 = new Patient("p1");
        Patient p2 = new Patient("p2");
        Patient p3= new Patient("p3");
        Patient p4 = new Patient("p4");
        Patient p5 = new Patient("p5");
        Thread doctor1 = new Thread(() -> {
        	
            try {
        	
            	synchronized(room.lock1) {
                while(!room.doctorEnter(siva)) {
                	System.out.println(String.format("Doctor %s is waiting to Enter, number of doctor %d", siva.name,room.getdlistSize()));
                	room.lock1.wait();
                	
                }
        	
                room.add(siva);
            	System.out.println(String.format("Doctor %s Entered, number of doctor %d", siva.name,room.getdlistSize()));
            }
            	Thread.sleep(500);
            synchronized(room.lock1) {
                //siva.add(room);
                
                while(!room.doctorLeave(siva)) {
                	room.remove(siva);
                	System.out.println(String.format("Doctor %s Left, number of doctor %d", siva.name,room.getdlistSize()));
                	//siva.remove(room);
                }
                room.lock1.notify();
            }}
             catch (InterruptedException e) {
                e.printStackTrace();
            }
        	
        });

        Thread doctor2 = new Thread(() -> {
        	
            try {
            	
            	synchronized(room.lock1) {
                while(!room.doctorEnter(john)) {
                	
                	System.out.println(String.format("Doctor %s is waiting to Enter, number of doctor %d", john.name,room.getdlistSize()));
                	room.lock1.wait();
                }
            	
                room.add(john);
            	System.out.println(String.format("Doctor %s Entered, number of doctor %d", john.name,room.getdlistSize()));
            	}
                //john.add(room);
                Thread.sleep(500);
                synchronized(room.lock1) {
                while(!room.doctorLeave(john)) {
                	room.remove(john);
                	System.out.println(String.format("Doctor %s Left, number of doctor %d", john.name,room.getdlistSize()));
                	//john.remove(room);
                }
                room.lock1.notify();
            } }
                catch (InterruptedException e) {
                e.printStackTrace();
            }
        	
        });

        Thread patient1 = new Thread(() -> {
        	
            try {
            	synchronized (room.lock2) {
                    while(!room.patientEnter(p1)) {
                    	System.out.println(String.format("Patient %s is waiting to enter, number of patients %d", p1.name,room.getplistSize()));
                    	room.lock2.wait();
                    }
                room.add(p1);
                System.out.println(String.format("Patient %s entered, number of patients %d", p1.name,room.getplistSize()));   
            	}
                Thread.sleep(500);
                synchronized (room.lock2) {
                    while(!room.patientLeave(p1)) {
                    	room.remove(p1);
                    	System.out.println(String.format("Patient %s left", p1.name));
                    }
                    room.lock2.notify();
            } }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        	
        });

        Thread patient2 = new Thread(() -> {
        	
            try {
            	synchronized (room.lock2) {
                while(!room.patientEnter(p2)) {
                	System.out.println(String.format("Patient %s is waiting to enter, number of patients %d", p1.name,room.getplistSize()));
                	room.lock2.wait();
                };
                room.add(p2);
                System.out.println(String.format("Patient %s entered, number of patients %d", p2.name,room.getplistSize())); 
            	}
                Thread.sleep(500);
                synchronized (room.lock2) {
                while(!room.patientLeave(p2)) {
                	room.remove(p2);
                	System.out.println(String.format("Patient %s left", p2.name));
                };
                room.lock2.notify();
            }}
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        	
        });

        Thread patient3 = new Thread(() -> {
        	
            try {
            	synchronized (room.lock2) {
                while(!room.patientEnter(p3)) {
                	System.out.println(String.format("Patient %s is waiting to enter, number of patients %d", p3.name,room.getplistSize()));
                	room.lock2.wait();
                };
                room.add(p3);
                System.out.println(String.format("Patient %s entered, number of patients %d", p3.name,room.getplistSize())); 
            	}
                Thread.sleep(500);
                synchronized (room.lock2) {
                while(!room.patientLeave(p3)) {
                	room.remove(p3);
                	System.out.println(String.format("Patient %s left", p3.name));
                };
                room.lock2.notify();
            }}
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        	
        });

        Thread patient4 = new Thread(() -> {
        	
            try {
            	synchronized (room.lock2) {
                while(!room.patientEnter(p4)) {
                	System.out.println(String.format("Patient %s is waiting to enter, number of patients %d", p1.name,room.getplistSize()));
                	room.lock2.wait();
                };
                room.add(p4);
                System.out.println(String.format("Patient %s entered, number of patients %d", p4.name,room.getplistSize()));
            	}
                Thread.sleep(500);
                synchronized (room.lock2) {
                while(!room.patientLeave(p4)) {
                	room.remove(p4);
                	System.out.println(String.format("Patient %s left", p4.name));
                };
                room.lock2.notify();
            }}
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        	
        });

        Thread patient5 = new Thread(() -> {
        	
        
            try {
            	synchronized (room.lock2) {
                while(!room.patientEnter(p5)) {
                	System.out.println(String.format("Patient %s is waiting to enter, number of patients %d", p1.name,room.getplistSize()));
                	room.lock2.wait();
                };
                room.add(p5);
                System.out.println(String.format("Patient %s entered, number of patients %d", p5.name,room.getplistSize())); 
            	}
            	Thread.sleep(500);
            	synchronized (room.lock2) {
                while(!room.patientLeave(p5)) {
                	room.remove(p5);
                	System.out.println(String.format("Patient %s left", p5.name));
                };
                room.lock2.notify();
            }}
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        	
        });

        doctor1.start();
        doctor2.start();
        patient1.start();
        patient2.start();
        patient3.start();
        patient4.start();
        patient5.start();
        
    }
}
