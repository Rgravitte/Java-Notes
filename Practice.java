public class Practice {
  int x = 5;

  int y;

  public int thisFunction(int y){
    return 5 + y;
  }
  public static void main(String[] args) {
    Practice secondPractice = new Practice();
    secondPractice.x = 10;
    secondPractice.y = 20;
    System.out.println(secondPractice.x + secondPractice.y);
    }
  }
