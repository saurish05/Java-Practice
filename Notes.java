/* Write a program to find minimum number of notes for given amount.
1  2  5  10  20  50 100

756

7-100
1-50
1-5
1-1
*/

class Notes{

public static void main (String args[]){

int amount = 800;

int hund = amount / 100;

amount = amount % 100;

int fifty = amount / 50;

amount = amount % 50;

int twenty = amount / 20;

amount = amount % 20;

int ten = amount / 10;

amount = amount % 10;

int five = amount / 5;

amount = amount % 5;

int two = amount / 2;

amount = amount % 2;

System.out.println("number of 100's = " + hund);
System.out.println("number of 50's = " + fifty);
System.out.println("number of 20's = " + twenty);
System.out.println("number of 10's = " + ten);
System.out.println("number of 5's = " + five);
System.out.println("number of 2's = " + two);
System.out.println("number of 1's = " + amount);
}
}