package CollectionFramework;

public class twoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list1[][] =new int[2][2];
		   
		   list1[0][0]=100;
		   list1[0][1]=111;
		   list1[1][0]=121;
		   list1[1][1]=131;
		   
		   
		   int size=list1.length;
		   System.out.println("Size of a list1 "+size);
		   
		   for(int i=0;i<size;i++) {
			   System.out.println("The value at 0 "+list1[i]);  
		   }
	}

}
