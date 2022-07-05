import java.util.ArrayList;

public class SimpleGen {
    private int wordSize;
    private String chars;

    public SimpleGen(int wordSize) {
        this.wordSize = wordSize;
        this.chars = "qwertyupqwertyup[]asdfghjkasdfghjk;'\\zxcvbnmzxcvbnm,./123456789123456789123456789-=!@#$%^&*()_+QEWRTYUPQEWRTYUP{}ASDFGHJKLASDFGHJKL:\"ZXCVBNMZXCVBNM<>?";
    }

    public SimpleGen(int wordSize, String chars) {
        this.wordSize = wordSize;
        this.chars = chars;
    }

    public String generate(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < wordSize; i++) {
            stringBuilder.append(chars.charAt((int)(Math.random()*chars.length())));

        }
        return stringBuilder.toString();
    }
    public ArrayList<String> generateAll(int quantity){
        ArrayList<String> result = new ArrayList<>();
        if(quantity<=0) throw new UnsupportedOperationException();
        for (int i = 0; i < quantity; i++) {
            result.add(generate());
        }
        return result;

    }
}
