package wp;
import java.util.ArrayList;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String studentName = "Bhargavi";
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(85);
		marks.add(90);
		marks.add(78);
		System.out.println("Marks of "+ studentName +":" + marks);
		int total = 0;
		for(int i = 0; i < marks.size(); i++) {
			total=total+marks.get(i);
		}
		double average = total/(double)marks.size();
		System.out.println("Total marks:" + total);
		System.out.println("Average marks:" + average);

	}

}
