import java.util.Scanner;
class quadratic {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double a,b,c,root1,root2,root;
double d;
System.out.println("Enter the three numbers:");
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
d=b*b-4*a*c;
root1=(-b+Math.sqrt(d))/(2*a);
root2=(-b-Math.sqrt(d))/(2*a);
if(d>0){
root1=(-b+Math.sqrt(d))/(2*a);
root2=(-b-Math.sqrt(d))/(2*a);
System.out.println("Roots are real and distinct:"+root1+" and "+root2 );
}
else if(d<0){
System.out.println("no real solutions");
}
else if(d==0){
System.out.println("roots are equal :"+root1);
}
}
}