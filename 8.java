// Pattern program 8
public class Main
{
	public static void main(String[] args) {
	    
	    int n = 5;
	    int x = 2;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=n;j++){
		        System.out.printf("%2d",x);
		        x+=2;
		    }
		    System.out.println();
		}
	}
}

/*

246810
1214161820
2224262830
3234363840
4244464850


*/
