package object;

 class Car {

		
	 private String name;                      //private variable
	 private double topSpeed;                  //private variable
//----------------------------------------------------------------------------	
 Car(){                  //constructor 
			
		}
		
 Car(String newnam, double newtopSpeed){
			
	 name = newnam;
	 topSpeed = newtopSpeed;
		}

//----------------------------------------------------------------------------
 public void setTopSpeed(double nnewtopSpeed){  //Setter

	  this.topSpeed = nnewtopSpeed;

}	
//----------------------------------------------------------------------------
 public double getTopSpeed(){       //Getter
	 
	 return topSpeed;
}
//----------------------------------------------------------------------------
public String getname(){             //Getter
	 
	 return name;
}
//----------------------------------------------------------------------------
public double getTopSpeedMPH(){           //Getter
	 
	 return topSpeed;
}
//----------------------------------------------------------------------------
public double getTopSpeedKMH(){              //Getter
	 
	 return topSpeed;
}
 }
