import java.util.Random;
public class EncryptionMain{
  public static void main(String args[]){
    long[] testVar = encryption("Hello World");
    for (long varIterative : testVar )
      System.out.println(varIterative);
  }
  public static long[] encryption(String txt){
    int[] seeder = new int[txt.length()];
    for (int iterations = 0; iterations < txt.length(); iterations++) {
     seeder[iterations] = Character.getNumericValue(txt.charAt(iterations));
    }
    long seed = 1;
    for ( int itemInArray : seeder ){
     seed += itemInArray; 
    }
    Random generator = new Random(seed);
    long randomGen = Math.abs(generator.nextLong());
    
    long[] resultingArray = new long[seeder.length];
    for (int iterations = 0; iterations < seeder.length; iterations++){
      resultingArray[iterations] = seeder[iterations] % randomGen;
    }
    return resultingArray;
  }
}