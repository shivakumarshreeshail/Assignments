class Building {
	int No_of_Doors;
	int No_of_Windows;
	int No_of_Rooms;
	String Flooring_Type;
	int No_of_Balkanies;
	String Colour_of_building;

	Building(int NOD, int NOW, int NOR, String FT, int NOB, String COB) {
		
		No_of_Doors = NOD;
		No_of_Windows = NOW;
		No_of_Rooms = NOR;
		Flooring_Type = FT;
		No_of_Balkanies = NOB;
		Colour_of_building = COB;
	}

	public void DescribeBuilding() {

		System.out.println("No of Doors : " + No_of_Doors);
		System.out.println("No of Windows : " + No_of_Windows);
		System.out.println("No of Rooms : " + No_of_Rooms);
		System.out.println("Flooring Type : " + Flooring_Type);
		System.out.println("No of Balkanies : " + No_of_Balkanies);
		System.out.println("Colour of building : " + Colour_of_building);

	}

}

class MultiStoredBuilding extends Building {
	int N0_of_buildings;

	MultiStoredBuilding(int NOD, int NOW, int NOR, String FT, int NOB, String COB, int Nob) {
		super(NOD, NOW, NOR, FT, NOB, COB);
		N0_of_buildings = Nob;
	}

	public void DescribeBuilding() {
		System.out.println("\n");
		System.out.println("Deatils of MultiStoredBuilding: ");
		super.DescribeBuilding();
		System.out.println("Number of buildings" + N0_of_buildings);
		System.out.println("\n");
	}
}

class DuplexBuilding extends Building {
	int No_of_stairs;

	DuplexBuilding(int NOD, int NOW, int NOR, String FT, int NOB, String COB, int NOS) {
		super(NOD, NOW, NOR, FT, NOB, COB);
		No_of_stairs = NOS;
	}

	public void DescribeBuilding() {
		System.out.println("\n");
		System.out.println("Deatils of MultiStoredBuilding: ");
		super.DescribeBuilding();
		System.out.println("Number of stairs" + No_of_stairs);
		System.out.println("\n");
	}
}

public class DifferentBuildings {

	public static void main(String[] args) {
		Building B = new Building(1, 2, 3, "Marble", 2, "White");
		B.DescribeBuilding();

		MultiStoredBuilding B1 = new MultiStoredBuilding(1, 2, 3, "Marble", 2, "White", 2);
		B1.DescribeBuilding();

		DuplexBuilding B2 = new DuplexBuilding(1, 2, 3, "Marble", 2, "White", 2);
		B2.DescribeBuilding();

	}

}
