
public class BomberPlane extends Plane{

int bommen;

	public BomberPlane(String naam, int Vluchtplafond, double stuwkracht,int vleugelspanwijdte, int lengte, int bommen) {
		super(naam, Vluchtplafond, stuwkracht, vleugelspanwijdte, lengte);
		this.bommen = bommen;
	}
}
