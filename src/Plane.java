
public class Plane {
	int amount = 0;
	
String naam;
int Vluchtplafond;
double stuwkracht;
int vleugelspanwijdte;
int lengte;
boolean BomberPlane = false;

public Plane(String naam, int Vluchtplafond, double stuwkracht,int vleugelspanwijdte, int lengte) {
		this.naam = naam;
		this.Vluchtplafond = Vluchtplafond;
		this.stuwkracht = stuwkracht;
		this.vleugelspanwijdte = vleugelspanwijdte;
		this.lengte = lengte;
		
		this.amount += 1;
	}
}
