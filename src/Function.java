import java.util.Scanner;

class Function {
    private Scanner sc1 = new Scanner(System.in);
    private Scanner sc2 = new Scanner(System.in);
    private double a;
    private double b;
    private double r;

    public void addition()
    {
        this.a = this.sc1.nextInt();
        this.b = this.sc2.nextInt();
        this.r = this.a + this.b;
        System.out.println(r);
    }

    public void substraction()
    {
        this.a = this.sc1.nextInt();
        this.b = this.sc2.nextInt();
        this.r = this.a - this.b;
        System.out.println(r);
    }

    public void multiply()
    {
        this.a = this.sc1.nextInt();
        this.b = this.sc2.nextInt();
        this.r = this.a * this.b;
        System.out.println(r);
    }

    public void divide()
    {
        this.a = this.sc1.nextInt();
        this.b = this.sc2.nextInt();
        this.r = this.a / this.b;
        System.out.println(r);
    }




}
