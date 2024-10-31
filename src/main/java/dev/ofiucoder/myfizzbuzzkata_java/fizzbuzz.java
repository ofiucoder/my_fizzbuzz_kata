package dev.ofiucoder.myfizzbuzzkata_java;

public class fizzbuzz {
    int i;

    public void FizzBuzz() {

        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz ");
            else if (i % 3 == 0)
                System.out.print("Fizz ");
            else if (i % 5 == 0)
                System.out.print("Buzz ");
            else
                System.out.print(i + " ");
        }
    }
}
