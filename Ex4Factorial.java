public class FactorialCalculator {

    public int calculateFactorial(int number) {
        
  if(number<0){
      return -1;
  }
  int fact=1;
  for(int i=2;i<=number;i++){
      fact=fact*i;
  }
   return fact;
    }
}
  
        
       //public static void main (String[] args) {
         //FactorialCalculator calculator=new FactorialCalculator(System.in);
         
        
