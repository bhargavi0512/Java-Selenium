package mypackage;

public class String2 {
	public static void main(String[] args) {
		StringBuffer Brand = new StringBuffer();
		Brand.append("Car Showroom \n");
		Brand.append("CustomerName: Munny \n");
		Brand.append("Cars: \n");
		Brand.append("BMW \n");
		Brand.append("Honda \n");
		Brand.append("KIA ");
		Brand.append("Thanks for Visiting");
		
		Brand.insert(14, "Location : Vijayawada \n");

		System.out.println(Brand.toString());
    }

}
