import java.util.*;
public class SimpleSort
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter total number of elements:");
int n= sc.nextInt(),a[]=new int[n];
System.out.println("enter"+n+"elements to be sorted:");
for(int i=0; i<n; i++)
a[i]=sc.nextInt();
for(int i=0; i<n; i++)
  for(int j=i+1; j<n; j++)
    if(a[i]>a[j])
    {
      int t=a[i];
       a[i]=a[j];
        a[j]=t;
    }
for(int i=0;i<a.length; i++)
{
System.out.print(a[i]+" ");
  }
}
}