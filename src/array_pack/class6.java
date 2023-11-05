package array_pack;

public class class6 {

	public static void main(String[] args) {
		class6 tom = new class6 ();
		tom.food();
		tom.water();
		tom.look();
		class6.picture();
		class6.image();
		class6.hair();
		tom.king();
		tom.queen();
	}
public void food() {//decrement using loop
String fruits [] = new String[4];
fruits[0]="apple";
fruits[1]="orange";
fruits[2]="banana";
fruits[3]="mango";
for(int i = 3;i>=0;i--) {
System.out.println(fruits[i]);	
	
}
}
	
public void water() {//decrement using loop
String fruits [] = new String[4];
fruits[0]="apple";
fruits[1]="orange";
fruits[2]="banana";
fruits[3]="mango";
for(int i = 2;i>=0;i--) {
System.out.println(fruits[i]);	
	
}
}
public void look() {
String fruits [] = new String[7];
fruits [0]= "apple";
fruits [1] ="orange";
fruits [2]="banana";
fruits [3]="mango";
fruits [4] ="cerry";		
fruits [5] ="berry";		
fruits [6] ="kwi";
for(int i =6;i>=0;i-- ) {
System.out.println(fruits[i]);	
	
	
}

}
public static void picture() {
int key [] = new int[5];
key [0] = 10;
key [1] = 20;
key [2] = 30;
key [3] = 40;
key [4] = 50;
for(int i = 4; i>=0;i--) {
System.out.println(key[i]);	
	
}	
}
public static void image() {
double lock [] = new double [9];
lock [0] = 11.55;
lock [1] = 12.55;	
lock [2] = 13.55;	
lock [3] = 14.55;	
lock [4] = 15.55;
lock [5] = 16.55;
lock [6] = 17.55;
lock [7] = 18.55;
lock [8] = 19.55;
for(int i = 8; i>=0; i--) {
System.out.println(lock[i]);	
	
	
}

}
public static void hair() {
char copy [] = new char [5];
copy [0] = 'a';
copy [1] = 'b';
copy [2] = 'c';
copy [3] = 'd';
copy [4] = 'e';
for(int i = 4; i>=0; i--) {
System.out.println(copy[i]);	
}


}
public void king() {      //odd number decrement//
String key [] = new String[8];
key [0] ="black";
key [1] ="red";
key [2] ="white";
key [3] ="pink";
key [4] ="purple";
key [5] ="yellow";
key [6] ="dark";
key [7] ="gray";
for(int i = 7; i>=0; i= i-2) {
System.out.println(key[i]);	
	
}	
}	
public void queen() {    //even number decrement//
int num [] = new int[11];
num [0] =100;
num [1] =200;
num [2] =300;
num [3] =400;
num [4] =500;
num [5] =600;
num [6] =700;
num [7] =800;
num [8] =900;
num [9] =1000;
num [10] =1100;
for(int i = 10; i>=2; i= i-2) {
System.out.println(num[i]);	
	
	
}


}	
	
}




