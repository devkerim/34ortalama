import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner intscanner= new Scanner(System.in);
	int sayi,i=0,sum=0,ort,j=0;
	System.out.println("Hangi sayıya kadar almak istersiniz: ");
	sayi  = intscanner.nextInt();


	while(i<=sayi){
		i++;
	    if(i%3==0&&i%4==0){
			j++;
	        sum = i +sum;
        }
    }
	ort = sum / j;
	System.out.println("ortalaması: "+ort);
    }
}
