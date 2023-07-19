package numbers;

public class NumberUtils {
    /**
     * Polymorphic method that determine the maximum in an array of numbers.
     * 
     * @param numbers the array numbers, being Number a polymorphic type
     * @return the maximum number
     */
    public static Number max(Number[] numbers) {
        if (numbers.length < 1) {
            throw new IllegalArgumentException();
        }
        
        Number maximum = numbers[0];
        
        
        for (Number n : numbers) {
            // here we use the overriden doubleValue() method
            // to achieve polymorphism
            if (n.doubleValue() > maximum.doubleValue()) {
                maximum = n;
            }
        }

        return maximum;
    }

    /**
     * Polymorphic method that sorts (inline) an array of numbers.
     * 
     * @param numbers the array of numbers
     */
    public static void sort(Number[] numbers) {
        if (numbers.length < 2) {
            return;
        }

        for (int i = 1; i < numbers.length; i++) {
            int j = i - 1;
            Number x = numbers[i];

            while (j >= 0 && numbers[j].doubleValue() > x.doubleValue()) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = x;
        }
    }

}
