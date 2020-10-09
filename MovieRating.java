import java.util.Scanner;

/*
Accept Name (string) and Length (int) Inputs
3 Different int ratings from movie review site 20
2 Different decimal ratings from focus group 30
1 Average decimal rating from professional movie critic 50
*/

class Movie {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      System.out.println("Whats the movies name?");
      String name = scan.nextLine();
      System.out.println("How long is it in minutes?");
      int length = scan.nextInt();
      System.out.println("Input 3 website ratings as an int");
      int webRev1 = scan.nextInt();
      int webRev2 = scan.nextInt();
      int webRev3 = scan.nextInt();
      System.out.println("Input 2 ratings from the focus group");
      double focRev1 = scan.nextDouble();
      double focRev2 = scan.nextDouble();
      System.out.println("Input a rating from a Movie Critic");
      double proRev = scan.nextDouble();

      int hours = (length / 60);
      int minutes = (length % 60);

      double avgWebRate = ((webRev1 + webRev2 + webRev3) / 3);

      double avgFocRate = ((focRev1 + focRev2) / 2);

      double weightedAvgWebRate = avgWebRate * 0.2;

      double weightedAvgFocRate = avgFocRate * 0.3;

      double weightproRev = proRev * 0.5;

      double overallRating = (weightedAvgFocRate + weightedAvgFocRate + weightproRev); 

      System.out.println("Title: " + name);
      System.out.println("Run Time: " + hours + "h" + minutes);
      System.out.println("Average Website Rating: " + avgWebRate);
      System.out.println("Average Focus Group Rating: " + avgFocRate);
      System.out.println("Average Movie Critic Rating: " + proRev);
      System.out.println("Overall Movie Rating: " + overallRating);


    }
}
