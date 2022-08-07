package week1.day1;

public class TwoWheeler {
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=6556565656565l;
	boolean isPunctured=false;
	String bikeName="FZ";
	double runningKM=62326262;

	public static void main(String[] args) {
		TwoWheeler twoWheeler = new TwoWheeler();
		System.out.println("noOfWheels : " +twoWheeler.noOfWheels);
		System.out.println("noOfMirrors : " +twoWheeler.noOfMirrors);
		System.out.println("chassisNumber : " +twoWheeler.chassisNumber);
		System.out.println("isPunctured : " +twoWheeler.isPunctured);
		System.out.println("bikeName : " +twoWheeler.bikeName);
		System.out.println("runningKM : " +twoWheeler.runningKM);
	}

}
