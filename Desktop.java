package week3.day2;

public class Desktop implements Hardware, Software {

	public void desktopModel() {

		System.out.println("Desktop Model");

	}

	public void softwareResources() {

		System.out.println("SofwareResorces");
	}

	public void hardwareResources() {

		System.out.println("Hardware Resources");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desktop DS = new Desktop();
		DS.desktopModel();
		DS.softwareResources();
		DS.hardwareResources();

	}

}
