public class threetwofive {
    int tour(int petrol[], int distance[])
    {
	// Your code here

	// Your code here
	   int start=0,deficit=0;
   int capacity=0;
 int n= petrol.length;  
   for(int i=0;i<n;i++)
   {
       capacity+=petrol[i]-distance[i];
       if(capacity<0){
           start=i+1;
           deficit+=capacity;
           capacity=0;
       }
   }
   return(capacity+deficit>0)?start:-1;
}
      
}
