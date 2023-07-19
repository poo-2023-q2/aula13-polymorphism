package animais;

public class Main {
    /**
     * Method that prints an animal.
     * 
     * @param a the animal (polymorphic type)
     */
    public static void printAnimal(Animal a) {
        System.out.println("Tipo:" + a.getClass().getSimpleName());
        System.out.println("O que come: " + a.come());
        System.out.println("Faz o som: " + a.fazSom());
        System.out.println();
    }

    /**
     * Method that prints an array of animals
     *
     * @param animals the array of animals
     */
    public static void printAnimals(Animal[] animals) {
        for (Animal a : animals) {
            printAnimal(a);
        }
    }

    /**
     * Generate some animals and print them.
     * 
     * @param args the args (not used)
     */
    public static void main(String[] args) {
        printAnimals(new Animal[] {
            new Cachorro(),
            new Gato(),
            new Porco(),
            new Passaro()
        });
    }
    
}
