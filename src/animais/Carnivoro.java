package animais;

/**
 * Carnivoro is an abstract class that provides a implementation
 * for of "come" to all its instances.
 */
public abstract class Carnivoro implements Animal {
    @Override
    public String come() {
        return "carne";
    }
}
