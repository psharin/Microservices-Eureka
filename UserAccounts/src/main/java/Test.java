import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("There");
		
		System.out.println(list.toString());
		
		String strList = list.toString();
		strList = strList.replace("[", "").replaceAll("]", "");
		
		System.out.println(strList);
		

		//SEELCT * FROM EMP WHERE EMP_NAME IN (1,2,3);

	}

}
