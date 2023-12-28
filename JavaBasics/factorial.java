//factorial of a number using iterative approach
/* Methods
Iterative approach for factorial
Recursive approach for factorial
Method 1:

For an input n
Initialize fact = 1
If num < 0 : Print Error as we can’t calculate factorial of a negative number
Else run a iterative loop in iteration of (i) between [1, n]
do fact = fact * i
print the value of fact */

import java.util.Scanner;
public class factorial {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n; // To hold number
int fact = 1; // To hold factorial
System.out.print("Enter any positive integer: ");
n = sc.nextInt();
if(n<0)
System.out.println("cant caluclate factorail of a negative number");
else{
for(int i=1; i<=n; i++) {
fact=fact*i;
}
System.out.println("Factorial of "+n+" is "+ fact);
}
}
}
