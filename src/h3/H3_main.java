package h3;

public class H3_main {
public static void main(String[] args) {
	int i; // i>j i>200 j>100
	i= 140;
	int j;
	j= 150;
	int k;
	k= -10;
	if (i>j && i<200 && j<100) {
		k= 1;
	} else if(i>j && i>200 && j<100) {
		k=2;
	} else if(i>j && i>200 && j>100) {
		k= 3;
	} else if(i<j && i<200 && j<100) {
		k= 4;
	}else {
		k= -10;
	}
	System.out.print("k = " + k);
}
}
