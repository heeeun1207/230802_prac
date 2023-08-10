package org.opentutorials.javatutorials.overloading.example1;

public class loopPrac01 {

//for
//	   public static void main(String[] args) {
//	        for (int i = 0; i < 10; i++) {
//	            System.out.println("Coding Everybody " + i);
//	        }
//	 
//	    }
	
//	public static void main(String[] args) {
//	for (int i = 1; i <=12; i++) {
//	      System.out.println(i  + "월");
//	}
//}
//}
	
//while
//	   public static void main(String[] args) {
//	int i = 0;
//	while(i<10){
//	    System.out.println("coding everybody"+i);
//	    i++;
//		}
//	  }	
	
//for-each
//	 public static void main(String[] args) {
//		 String[] members = {"정희은", "정지은" ,"냥냥" };
//		 for (String e : members ) {
//			 System.out.println(e + "이 상담을 받았습니다.");
//		 }
//	 	}
//	 }

	public static void main(String[] args) {
		String[] listmembers = {"정희은", "정지은", "냥냥" };
		for (String e : listmembers) {
			System.out.println(e +"이 인터뷰 받았습니다." );
		}
	}
}
