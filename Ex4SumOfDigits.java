public class NumberUtils {

    public int getSumOfDigits(int number) {

     if(number<0){
         return -1;
     }
     if(number==0){
         return 0;
     }
     int sum=0;
     while(number!=0){
         int digit=number%10;
          sum=sum+digit;
        number=number/10;
     }
return sum;
    }
}
