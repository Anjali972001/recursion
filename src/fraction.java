public class fraction {
    private int numerator;
    private int denominator;
    fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }


    private  void simplify()
    {

        int gcd= 1;// gcd stands for greatest common divisor
        int min = Math.min(numerator, denominator);// to ger the smaller value of the numerator and denominator
        for (int i = 2; i <= min; i++) //iterate until we get the smallest value
        {
            if (numerator % i == 0 && denominator % i == 0)
            {
                gcd = i;// if num or den %2==0---> then gcd=i
            }
        }

        numerator = numerator / gcd;// dividing by the gcd we will get the simplified value of the numerator
        denominator = denominator / gcd;// same with the denominator
    }
    public void print()
    {
        System.out.println(numerator +"/"+ denominator);
    }

    public static void main(String[] args) {
        fraction f1= new fraction(4,6);
        f1.print();

    }

}
