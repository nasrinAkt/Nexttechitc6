package array_pack;

public class class5 {

	public static void main(String[] args) {
		class5 food	= new class5();
		food.cake();
		food.cup();
		food.glass();              /* for odd/even number if we use <= so {inside the curly braces} 
		class5.door();              we have to put odd/even number, basically when we use array with
		class5.window();           loop because we are using length here.*/
		class5.boat();             //if we use < so no need odd/even value inside{}this//
		class5.pink();
	}
public void cake() {  
String [] cars = {"Volvo","BMW","Ford","Mazda"};
for(int i = 1;i<=cars.length;i=i+2) {	
System.out.println(cars[i]);	
	
}
	
}

	public void cup() {
String [] goods ={"table","chair","sofa","bed","tool","lamp","fan"};
for(int i = 0;i<=goods.length;i=i+2) {	
System.out.println(goods[i]);	
	
}	
	}	
	
	public void glass() {
		String [] goods ={"table","chair","sofa","bed","tool","lamp","fan","chest"};
		for(int i = 1;i<=goods.length;i=i+2) {	
		System.out.println(goods[i]);	
			
		}	
			}	
public static void door() {
int [] num = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
for(int i = 0; i<=num.length;i=i+2) {	
System.out.println(num[i]);	
	
	
}
}	
public static void window() {
int [] num = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
for(int i = 3; i<=num.length;i=i+2) {	
System.out.println(num[i]);	
	
	
}
}		
public static void boat() {
double []key = {1.99,2.99,3.99,4.99,5.99,6.99,7.99};
for(int i = 2; i<=key.length;i=i+2) {
	System.out.println(key[i]);
		
}
}
public static void pink() {
double [] bag = {1.99,2.99,3.99,4.99,5.99,6.99,7.99,8.88};
for(int i =3; i<=bag.length;i=i+2) {
System.out.println(bag[i]);	
	
}
}
}
