package src.main.com.agp.recursion;

public class RecursionUtil {
    /*---------------------------------------------------------------------------
        Problem : Find the sum of all the digits of the positive integer number
        Example : 234 = 2+3+4 = 9
        Formula : f(n) = f%10 + f(n/10)
    -----------------------------------------------------------------------------*/
   public int sumOfDigits(int n){
       if(n==0||n<0){
           return 0;
       }
       return n%10 + sumOfDigits(n/10);
   }

    /*---------------------------------------------------------------------------
         Problem : Find the power of the number multiply by n times
         input : n = 2 , exp = 3 : 2*2*2 = 8
         Formula : f(n) = n * f(n-1)
     -----------------------------------------------------------------------------*/
    public int powerofNumber(int n,int exp){
        if(exp<0){
            return 0;
        }
        if(exp==0){
            return 1;
        }
        return n * powerofNumber(n,exp-1);
    }

    /*---------------------------------------------------------------------------
         Problem : Find the Greatest Common Divisor of two numbers.
         Example : gcd(54,16) = 2
         Step 1 : 54/16 = 3 remainder 6
         Step 2 : 16/6 = 2 remainder 4
         Step 3 : 6/4 = 1 remainder 2
         Step 4 : 4/2 = 2 remainder 0
         Formula : gcd(a,0) = a
                   gcd(a,b) = gcd(b,a%b)
     -----------------------------------------------------------------------------*/
    public int gcd(int a,int b){
        if(a<0 || b<0){
            return -1;
        }
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    /*---------------------------------------------------------------------------
             Problem : Convert the number from decimal to binary.
             Example : 13 = 1101
             Step 1 : 13/2 = 6 remainder 1
             Step 2 : 6/2 = 3 remainder 0
             Step 3 : 3/2 = 1 remainder 1
             Step 4 : 1/2 = 0 remainder 1

             Now to form the answer 1101 we have to multiply by 10 and add the above number i.e
             1 * 10 + 1 = 11
             11 * 10 + 0 = 110
             110 * 10 + 1 = 1101

             Formula : f(n) = n%2 + 10 * f(n/2)
         -----------------------------------------------------------------------------*/
    public int decimalToBinary(int n){
               if(n==0){
            return n;
        }
        return n%2 + 10*decimalToBinary(n/2);
    }

    /*---------------------------------------------------------------------------
             Problem : Find the factorial of the n number
             Example : 4 = 4*3*2*1 = 24
             Formula : f(n) = n * f(n-1)
         -----------------------------------------------------------------------------*/
    public int factorial(int n){
        if(n < 0){
            return -1;
        }
        if(n==0){
            return 1;
        }
        if(n==1){
            return n;
        }
        return n * factorial(n-1);
    }

    /*---------------------------------------------------------------------------
           Problem : Write a recursive function called fib which accepts a number and returns the nth number
            in the Fibonacci sequence. Recall that the Fibonacci sequence is the sequence of whole
            numbers 0,1, 1, 2, 3, 5, 8, ... which starts with 0 and 1, and where every number
            thereafter is equal to the sum of the previous two numbers.

           Example : fib(4) # 3
                     fib(10) # 55
                     fib(28) # 317811
                     fib(35) # 9227465
            Formula : f = f(n-1) + f(n-2)
         -----------------------------------------------------------------------------*/
    public int fibonacci(int n){
        if(n<0){
            return -1;
        }
        if(n==0 || n ==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
