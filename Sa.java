import java.io.*;
import java.util.*;
public class Sa
{
  public static void main(String args[])
   {
     int source[]={1,2,3,4,5,6};
     int dest[]=new int[10];
     System.arraycopy(source,0,dest,0,source.length);
     for(int i=0;i<dest.length;i++)
     {
      System.out.println(i);
     }
   }
}   