import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
	
	Plane[] Planes = new Plane[10];
	BomberPlane[] BomberPlanes = new BomberPlane[3];
	Hanger[] Hangers = new Hanger[15];
	
	
	ArrayList<Plane> fittingplanes = new ArrayList<Plane>();
	HashMap<Hanger, ArrayList> HangerNotes = new HashMap<Hanger, ArrayList>();
	
	
	
	public static void main(String[] args) {
		Main T = new Main();
		
		try {
			File MyFile = new File("Output.txt");
			if(MyFile.createNewFile()) {
				System.out.println("File made: " + MyFile.getName());
			}
			else {
				System.out.println("File already made");
			}
		} catch(IOException e){
			e.printStackTrace();
		}
		T.aanmaken();
		T.maakHangers();
		
		T.gemiddelde();
		T.GrootsteStuwkracht();
		T.GrootsteLengte();
		T.TestAll();
	}
	
	public void aanmaken() {
		
		Plane plane1 = new Plane("plane1", 3000, 0.84, 20, 60);
		Plane plane2 = new Plane("plane2", 2500, 1.05, 18, 55);
		Plane plane3 = new Plane("plane3", 3500, 0.75, 30, 65);
		Plane plane4 = new Plane("plane4", 4000, 0.94, 25, 60);
		Plane plane5 = new Plane("plane5", 2000, 1.11, 15, 20);
		Plane plane6 = new Plane("plane6", 4000, 0.94, 30, 40);
		Plane plane7 = new Plane("plane7", 4200, 0.88, 25, 60);
		BomberPlane BomberPlane1 = new BomberPlane("BomberPlane1", 2500, 1.33, 25, 30, 4);
		BomberPlane BomberPlane2 = new BomberPlane("BomberPlane2", 3000, 1.21, 35, 35, 6);
		BomberPlane BomberPlane3 = new BomberPlane("BomberPlane3", 2000, 1.09, 30, 45, 10);
		
		Planes[0] = plane1;
		Planes[1] = plane2;
		Planes[2] = plane3;
		Planes[3] = plane4;
		Planes[4] = plane5;
		Planes[5] = plane6;
		Planes[6] = plane7;
		Planes[7] = BomberPlane1;
		Planes[8] = BomberPlane2;
		Planes[9] = BomberPlane3;
	}
	
	public void maakHangers() {
			Hanger hanger1 = new Hanger("hanger1");
			Hanger hanger2 = new Hanger("hanger2");
			Hanger hanger3 = new Hanger("hanger3");
			Hanger hanger4 = new Hanger("hanger4");
			Hanger hanger5 = new Hanger("hanger5");
			Hanger hanger6 = new Hanger("hanger6");
			Hanger hanger7 = new Hanger("hanger7");
			Hanger hanger8 = new Hanger("hanger8");
			Hanger hanger9 = new Hanger("hanger9");
			Hanger hanger10 = new Hanger("hanger10");
			Hanger hanger11 = new Hanger("hanger11");
			Hanger hanger13 = new Hanger("hanger12");
			Hanger hanger12 = new Hanger("hanger13");
			Hanger hanger14 = new Hanger("hanger14");
			Hanger hanger15 = new Hanger("hanger15");
			
			Hangers[0] = hanger1;
			Hangers[1] = hanger2;
			Hangers[2] = hanger3;
			Hangers[3] = hanger4;
			Hangers[4] = hanger5;
			Hangers[5] = hanger6;
			Hangers[6] = hanger7;
			Hangers[7] = hanger8;
			Hangers[8] = hanger9;
			Hangers[9] = hanger10;
			Hangers[10] = hanger11;
			Hangers[11] = hanger12;
			Hangers[12] = hanger13;
			Hangers[13] = hanger14;
			Hangers[14] = hanger15;
	}
	
	
	public void gemiddelde() {
		int totaalhoogte = 0;
		
		for(int a = 0; a<7; a++) {
			totaalhoogte += Planes[a].Vluchtplafond;
		}
		for(int b = 7; b<BomberPlanes.length; b++) {
			double vluchthoogte = 0;
				vluchthoogte = Planes[b].Vluchtplafond*(1.00-(((3)*BomberPlanes[b].bommen)/100));
			totaalhoogte += vluchthoogte;
		}
		System.out.println("Gemiddelde hoogte is: " + totaalhoogte/Planes.length + "M");
		
		try {
			FileWriter Write = new FileWriter("Output.txt");
			Write.write("Gemiddelde hoogte is: " + totaalhoogte/Planes.length + "M");
			Write.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void GrootsteStuwkracht() {
		double grootsteStuwkracht = 0;
		String grootsteStuwkrachtNaam = "";
		for(int a = 0; a<Planes.length; a++) {
			if(Planes[a].stuwkracht > grootsteStuwkracht) {
				grootsteStuwkracht = Planes[a].stuwkracht;
				grootsteStuwkrachtNaam = Planes[a].naam;
			}
		}
		System.out.println("de grootste stuwkracht is: " + grootsteStuwkracht + ", van " + grootsteStuwkrachtNaam);
		try {
			FileWriter Write = new FileWriter("Output.txt");
			Write.write("de grootste stuwkracht is: " + grootsteStuwkracht + ", van " + grootsteStuwkrachtNaam);
			Write.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void GrootsteLengte() {
		int grootsteLengte = 0;
		String grootsteLengteNaam = "";
		for(int a = 0; a<Planes.length; a++) {
			if(Planes[a].lengte>grootsteLengte) {
				grootsteLengte = Planes[a].lengte;
				grootsteLengteNaam = Planes[a].naam;
			}
		}
		System.out.println("De vliegte met de grootste lengte is: " + grootsteLengteNaam + ", " + grootsteLengte + "M");
		try {
			FileWriter Write = new FileWriter("Output.txt");
			Write.write("De vliegte met de grootste lengte is: " + grootsteLengteNaam + ", " + grootsteLengte + "M");
			Write.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void TestAll() {
		for(int a = 0; a < Hangers.length; a++) {
			System.out.println();
			System.out.println("---");
			for(int b = 0; b < Planes.length; b++) {
				Hangers[a].FitsPlane(Planes[b]);
			}
		System.out.println("---");
		}
	}
}
