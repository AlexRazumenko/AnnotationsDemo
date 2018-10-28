package ua.kiev.prog;

import ua.kiev.prog.MethodParameters;

//multiples numbers from a to b
//example: a=2, b=5
//res = 2*3*4*5


public class Mult {

    @MethodParameters(a = 7, b = 5)
    public static int mult (int a, int b) {

        int min, max;

        if (a <= b) { min = a; max = b;}
        else {min = b; max = a;}

        int result = 1;
        for (int i = min; i <= max; ++i) {
            result *= i;
        }

    return result;
}

    public Mult() {}


}
