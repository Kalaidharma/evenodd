import java.util.Scanner;
public class evenoddplace {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int count = 0, n,n1,i,j;
		n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++){
           arr[i]=sc.nextInt();
		if(((i%2==0&&arr[i]%2!=0))||((i%2!=0&&arr[i]%2==0))){
		System.out.println(arr[i]);
			}
		}
		}
		}
		
		

