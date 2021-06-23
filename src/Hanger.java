
public class Hanger {	
	String naam;
	double hoogte = 0;
	double breedte = 0;
	boolean bomberplanesave = false;
	
	public Hanger(String naam) {
		this.naam = naam;
		this.hoogte = 20+(Math.random()*80);
		this.breedte = 20+(Math.random()*80);
		double vijlig = Math.random();
		if(vijlig >0.5) {
			this.bomberplanesave = true;
		}
	}
	public boolean FitsPlaneBoolean(Plane plane) {
		if(plane.lengte > this.hoogte) {
			return false;
		}
		else if(plane.vleugelspanwijdte > this.breedte) {
			return false;
		}
		else if(plane.BomberPlane == true && this.bomberplanesave != true) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void FitsPlane(Plane plane) {
		if(plane.lengte > this.hoogte) {
			System.out.println(plane.naam + " is te lang voor " + this.naam);
		}
		else if(plane.vleugelspanwijdte > this.breedte) {
			System.out.println(plane.naam + " is te breedt voor " + this.naam);
		}
		else if(plane.BomberPlane == true && this.bomberplanesave != true) {
			System.out.println(plane.naam + " is niet vijlig voor " + this.naam);
		}
		else {
			System.out.println(plane.naam + " kan vijlig landen in " + this.naam);
		}
	}
}
