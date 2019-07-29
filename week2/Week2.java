public class Week2
{
   public static void main(String[] args)
   {
      //Exercise 1
      System.out.println("*************************************************");
      System.out.println("Running Week 2 -Execerise 1");
      System.out.println("*************************************************");
      float mathAnser = 0F;
      mathAnser = 4 + 6 * 2;
      System.out.println("Answer a) " + mathAnser);
      mathAnser = 10 / 5 + 8;
      System.out.println("Answer b) " + mathAnser);
      mathAnser = 12 / 4 + 16 / 2;
      System.out.println("Answer c) " + mathAnser);
      mathAnser = 17 / 2;
      System.out.println("Answer d) " + mathAnser);      
      mathAnser = 22 / 5;
      System.out.println("Answer e) " + mathAnser);
      mathAnser = 39 / 10;
      System.out.println("Answer f) " + mathAnser);
      mathAnser = 19 % (2 + 3);
      System.out.println("Answer g) " + mathAnser);
      mathAnser = 3 +4 * 20 /3;
      System.out.println("Answer h) " + mathAnser);
      mathAnser = 36 % (6 + 2);
      System.out.println("Answer i) " + mathAnser);      
      mathAnser = 8 % 2 * 0;
      System.out.println("Answer j) " + mathAnser); 
      //Exercise 2
      System.out.println("*************************************************");
      System.out.println("Running Week 2 -Execerise 2 Boolean expressions");  
      System.out.println("*************************************************");
      boolean Anser;
      Anser = 15 > 13;
      System.out.println("Answer a) " + Anser);
      Anser =  8 <= (2 + 6);
      System.out.println("Answer b) " + Anser);
      Anser =  5 == 15;
      System.out.println("Answer c) " + Anser);
      Anser =  3 >= 3;
      System.out.println("Answer d) " + Anser);     
      Anser =  3 * 3 == 2 * 4;
      System.out.println("Answer e) " + Anser);
      Anser = 5 < 8 -3;
      System.out.println("Answer f) " + Anser);
      Anser =  7 != 7;
      System.out.println("Answer g) " + Anser);
      Anser =  8 != (2 +5);
      System.out.println("Answer h) " + Anser);
      Anser =  10 - 20 == -10;
      System.out.println("Answer i) " + Anser);     
      Anser =  3 + 2 * 6 == 15;
      System.out.println("Answer j) " + Anser);
      //Exercise 3
      System.out.println("*************************************************");
      System.out.println("Running Week  -Execerise 3 Best Data Types");  
      System.out.println("*************************************************");
      // Declare intsiblings as int becuase you can only have a zero or a whole number for an answer 
      int intsiblings = 3;
      System.out.println("Answer a) The number of siblings I have is: " + intsiblings);
      // Declare boolcompetent as boolean as final grade can only be compentent True or False
      boolean boolcompetent = true;
      System.out.println("Answer b) For Java Programming Student Mark Guest is competent: " + boolcompetent);
      // Declare longPopulation as a long due to number being over 2 billion
      long longPopulation = 7577130400L;
      System.out.println("Answer c) The population of the earch is : " + longPopulation);
      // Declare intCountyPop as a int due to US county population size ranging between 100 and 10000000
      int intCountyPop = 10000000;
      System.out.println("Answer d) The population of the largest US county is : " + intCountyPop);
      // Declare byteBusPassengers as a byte due to Bus passenger size ranging between 0 and 60
      byte byteBusPassengers = 48;
      System.out.println("Answer e) The number of passengers on the bus is  : " + byteBusPassengers);
      // Declare shortScrabbleScore as scores can range between 0 and 1200
     short shortScrabbleScore = 450;
      System.out.println("Answer f) My Scrabble score was:  " + shortScrabbleScore);
      // Declare byteTeamScore as a byte due to higest ever recorded run count for a single MBL game being 30. So run count range is 0 - 30
      byte byteTeamScore = 21;
      System.out.println("Answer g) The number of runs the Dodgers scored today : " + byteTeamScore);
      // Declare shortYear as a short - this should give sufficent range for years for any program used in our life times
      short shortYear = 1980;
      System.out.println("Answer h) Mark Guest was born in the year : " + shortYear);
   }
}