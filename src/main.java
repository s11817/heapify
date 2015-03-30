
public class main {

	public static void main(String[] args) {
		
		
		 int[] A = new int[10];
		
		A[0]=16;
		A[1]=4;
		A[2]=10;
		A[3]=14;
		A[4]=7;
		A[5]=9;
		A[6]=3;
		A[7]=2;
		A[8]=8;
		A[9]=1;
		
		heapify(A,1);
		

	}

	private static void heapify(int[] A, int i) {
		
		
		
		int l,r,largest;
		l = 2*i+1;				// plus jeden poniewa¿ zaczynamy od zera
		r = 2*i+1+1;
		
		System.out.println("");
	
		for (int j=0; j<10; j++){
			System.out.print("A["+j+"]="+A[j]+" ");
		}	
		
		
			if((A.length >= l)&& (A[l] > A[i])){
				largest = l;
				
			}else largest = i;
			
		if((A.length>=r)&&(A[r]>A[largest])){
			largest = r;
		}
		
		if( largest != i){
			int h;
			h=A[largest];
			A[largest] = A[i];
			A[i]=h;
			
			
			System.out.println("");
			System.out.println("largest="+largest+" leftSon="+l+" rightSon="+r);
			
			
			
		heapify(A,largest);
		}
		
		
		
				
	}

	
	
	
}
