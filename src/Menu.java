import java.util.Scanner;

class Menu {

    private Scanner sc = new Scanner(System.in);
    private Scanner sc2 = new Scanner(System.in);
    private char plr;
    private int choose;
    private char ents = 'y';
    private char ent = 'Y';

    private Function fun = new Function();

    public void menu() throws InterruptedException
    {
        System.out.print("Pick Y(Open Calculator) OR N(Or Other Letter!,  Calculator Will be close!): ");
        plr = sc.next().charAt(0);
        if((plr == ents) || (plr == ent )){


            System.out.println("Option 1 is addition");
            System.out.println("Option 2 is Substraction");
            System.out.println("Option 3 is Multiply");
            System.out.println("Option 4 is Divide");
            System.out.print("Chose your option: ");
            choose = sc2.nextInt();


            switch(choose)
            {
                case 1:

                    fun.addition();
                    break;
                case 2:
                    fun.substraction();
                    break;
                case 3:
                    fun.multiply();
                    break;
                case 4:
                    fun.divide();
                    break;
                default:
                    System.out.println("This option does not exist");
                    Thread.sleep(1000);
                    System.out.println("Program Will be close in ");
                    for(int i = 0; i<5; i++)
                    {
                        Thread.sleep(1000);
                        System.out.println(i);
                    }
                    break;
            }



        }
        else
        {
            System.out.println("Program Will be close in ");
            for(int i = 1; i<6; i++)
            {
                Thread.sleep(1000);
                System.out.println(i);
            }
            System.out.println("Thanks For using our Calculator!");
            System.exit(1);
        }
    }



}
