public class NumberUtils {

    public int getNumberOfDigits(int number) {
      if(number ==0){
          return 1;
      }
      if(number<0){
          return -1;
      }
      int digits=1;
      while(number>=10){
          number=number/10;
          digits++;
          
          
      }
      return digits;
    }
}
