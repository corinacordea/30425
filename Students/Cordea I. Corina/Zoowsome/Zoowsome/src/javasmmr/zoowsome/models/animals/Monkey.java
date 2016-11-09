package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{
		public Monkey(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair ){
			this.setName(name);
			this.setNrOfLegs(nrOfLegs);
			this.setNormalBodyTemp(normalBodyTemp);
			this.setPercBodyHair(percBodyHair);
		}
		public Monkey(){
			this.setName("Monkey");
			this.setNrOfLegs(4);
			this.setNormalBodyTemp((float)36.7);
			this.setPercBodyHair((float)87.5);
		}	
}
