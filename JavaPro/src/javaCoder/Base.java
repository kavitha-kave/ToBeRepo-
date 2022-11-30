package javaCoder;

import java.util.HashMap;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		HashMap<Integer, String> info = new HashMap<>();
		info.put(1, "kate");
		info.put(2, "yeast");
		info.put(3, "beast");
		System.out.print("info" + info);
		info.toString();
		System.out.print("to String-->" + info.toString() + " getClass-->" + info.getClass());

		if (info.containsKey(1)) {
			System.out.print("True");
		}

		String a = "Good to Know things";
		 
		System.out.print("Length-->"+a.length());
		//System.out.print("a.describeConstable()" +a.describeConstable());
		for (int i = a.length()-1; i > -1; i--) {
			System.out.print(a.charAt(i)  );
		
		}
		
		int num[] = new int[6];
		for(int i =0; i< num.length;i++)
		{
			int d = num[i] = i;
			System.out.println("num[i]--->"+num[i]);
			System.out.println("d--->"+d);
		 
			
		}
		System.out.println("    "+"num....>"+num);
		
	 
		 
	}

}
