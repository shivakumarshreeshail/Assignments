//Print pattern using loops 
public class PrintPattern {

	public static void main(String[] args) {
		
		int i,j,k,max=5;
		String Text="";
		//first outer loop is to append & print in incremental order
		for(i=1;i<=max;i++){
			Text=Text+i;
			System.out.println(Text);
			if(i==max){
				for(j=1;j<=max;j++){//loop max-1
					Text="";
					for(k=1;k<=max-j;k++){//print append & print decremental order
						Text=Text+k;
					}
					System.out.println(Text);
				}
			}
		}
					
	}		
	
}


