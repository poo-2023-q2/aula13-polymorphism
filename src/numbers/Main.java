package numbers;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        // Java performs autoboxing of number literals
        // as instances of boxing classes
        Integer v1 = 10;
        Double v2 = 30.0;        
        Boolean v3 = true;
        Long v4 = 20L;
        Short v5 = 100;
        Number v6 = 201L; // Long
        Number v7 = 200.0f; // Float
        

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);


        System.out.println();

        System.out.println(v1 instanceof Number);
        System.out.println(v2 instanceof Number);
        System.out.println(v4 instanceof Number);

        // Due to the polymorphic type "Number", we can create an 
        // array of multiple different types
        Number[] numbers = new Number[] {v1, v2, v4, v5, v6, v7};

        // We can call methods with an array of a polimorphic type
        System.out.println(Arrays.toString(numbers));
        System.out.println(NumberUtils.max(numbers));
        NumberUtils.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(); 
    }
}
