import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import jdk.internal.net.http.common.Pair;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of integers ");
     int n1 = scan.nextInt();
     System.out.println("entter the element ");
     Integer [] arr1 = new Integer [n1];
     for(int i =0;i<n1;i++){
         arr1[i] = scan.nextInt();
        }
      Map<Integer, Integer> map=new HashMap<Integer,Integer>();
     
      for(int i = 0;i<arr1.length;i++){
            map.put(i,arr1[i]);
         }
      
    }
}
