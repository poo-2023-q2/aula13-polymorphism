package animais;

public class Passaro implements Animal {

    @Override
    public String fazSom() {
        return "piu piu";
    }

    @Override
    public String come() {
        return "seeds";
    }
    
}
