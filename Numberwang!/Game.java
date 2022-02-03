/*  Noam Bechhofer
    Game.java - a Numberwang game.
    */
import java.util.Random;
import java.util.Scanner;
public class Game{

  private boolean isJulie;
  private Random rn;
  private Scanner sc;

  public Game(){
    this.rn = new Random();
    this.sc = new Scanner(System.in);
    System.out.println("Hey! Would you like to play as Julie or Simon? 'j' or 's'");
    char name = this.sc.next().charAt(0);
    if (name == 'j' || name == 'J'){
      this.isJulie = true;
    } else if (name == 's' || name == 'S'){
      this.isJulie = false;
    } else {
      throw new IllegalArgumentException(name + " is a bad name input");
    }
  }

  public void play() throws InterruptedException{

    //welcome message
    System.out.println("Welcome to Numberwang DIGITAL, the MathS video game that simply everyone!");
    if (this.isJulie) {
      System.out.println("Julie, you go first");
    } else {
      System.out.println("Julie, you go first!");
      Thread.sleep(500);
      System.out.println("Ooh, too slow Julie! Simon?");
    }

    //play up to 6 rounds, scores update each round and are random
    int length = this.rn.nextInt(6)+1;
    for (int i = 0; i < length; i++){
      this.round(false);
    }
    double score1 = this.rn.nextInt()+this.rn.nextDouble();
    double score2 = this.rn.nextInt()+this.rn.nextDouble();
    Thread.sleep(1000);
    System.out.printf("And the score now stands equal at %f to %f.\n", score1, score2);
    //Wangernumb
    Thread.sleep(250);
    System.out.println(" __    __   ____  ____    ____    ___  ____   ____   __"
    + " __  ___ ___  ____  \n|  |__|  | /    ||    \\  /    |  /  _]|    \\ |  "
    + "  \\ |  |  ||   |   ||    \\ \n|  |  |  ||  o  ||  _  ||   __| /  [_ |  "
    + "D  )|  _  ||  |  || _   _ ||  o  )\n|  |  |  ||     ||  |  ||  |  ||    "
    + "_]|    / |  |  ||  |  ||  \\_/  ||     |\n|  `  '  ||  _  ||  |  ||  |_ "
    + "||   [_ |    \\ |  |  ||  :  ||   |   ||  O  |\n \\      / |  |  ||  |  "
    + "||     ||     ||  .  \\|  |  ||     ||   |   ||     |\n  \\_/\\_/  |__|_"
    + "_||__|__||___,_||_____||__|\\_||__|__| \\__,_||___|___||_____|");
    Thread.sleep(1000);
    System.out.println("It's time for Wangernumb, let's rotate the board!");
    Thread.sleep(250);
    System.out.println(Fortune.next());
    /*we argue true to initiate wangernumb rounds. We don't receive true until
    wangernumb is scored, thus allowing us to end the game. Until then, we keep
    looping rounds.*/
    while (!(this.round(true))){}


    //reward and punishment
    Thread.sleep(1000);
    System.out.println("Normally at this point Julie would " + this.punishment()
    + ". However since this is Numberwang DIGITAL, you can play again!"
    + " Would you like to? 'y' or 'n'");
    char repeat = this.sc.next().charAt(0);
    switch (repeat){
      case 'y':
      case 'Y':
        this.play();
        break;
      case 'n':
      case 'N':
        System.out.println("Well you'll be back soon, but until then... stay Numberwang!");
        break;
      default:
        throw new IllegalArgumentException(repeat + " is a bad input");
    }

  }

  private boolean round(boolean wangernumb) throws InterruptedException{
    System.out.println("Pick a number");
    sc = new Scanner(System.in);
    this.sc.nextLine();
    //will argue the same boolean as was argued to us. Basically we pass the buck on wangernumbing
    if (this.numberwang(wangernumb)){
      return true;// meaning "wangernumb has been achieved!"
    }
    Thread.sleep(250);
    if (this.isJulie) {
      System.out.println("Simon?");
    } else {
      System.out.println("Julie?");
    }
    Thread.sleep(250);
    System.out.printf("\"%d\"\n", this.rn.nextInt());
    //see previous 2 comments
    if (this.numberwang(wangernumb)){
      return true;
    }
    return false;
  }

  private boolean numberwang(boolean wangernumb) throws InterruptedException{
    int dice = this.rn.nextInt(2);
    switch (dice){
      case 0:
        if (wangernumb) {
          //Simon always wins, even when he loses. That's basically canon.
          System.out.println("That's Wangernumb! Simon wins!!");
          return true;// meaning "wangernumb has been achieved!"
        } else {
          System.out.println("That's Numberwang!");
        }
        Thread.sleep(250);
        break;
      case 1:
        if (wangernumb) {
          System.out.println("That's not Wangernumb.");
        } else {
          System.out.println("That's not Numberwang.");
        }
        Thread.sleep(250);
    }
    return false;
  }

  private String punishment(){
    int key = this.rn.nextInt(5);
    switch(key){
      case 0:
        return "be thrown in the sarlacc pit while Simon does cool backflips";
      case 1:
        return "be legally required to settle medical debt with a collections "
        + "agency while pharmaceutical reps take Simon out for a steak lunch";
      case 2:
        return "drop the portal gun in the equipment recovery annex"
        + " while Simon eats cake";
      case 3:
        return "be fed to Coloson, while Simon would get a picture of a chicken";
      case 4:
        return "have to advocate for gun control legislation in front of the US"
        + " Senate while Simon questions her about her personal life";
    }
    return "have something happen to her";
  }
}
