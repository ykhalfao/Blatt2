package h2;

public class H2_main {
public static void main(String[] args) {
	int i;
	i=5;
	int j;
	j=10;
	int k;
	k=15;
	int min;
	if (i<j && i<k) {
		min= i;
	} else if (j<k && j<i) {
		min= j;
	} else {
		min= k;
	} 
		
	int max;
	if (i>j && i>k) {
		max= i;
	} else if (j>k && j>i) {
		max= j;
	} else {
		max= k;
	}
	System.out.println("Der kleinste Wert min ist: " + min);
	System.out.println("Der größte Wert max ist: " + max);
}
}
