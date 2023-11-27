public class CustomString {
    //class atribute
    public String string;
    //constructer
    public CustomString(String string){
        this.string = string;
    }
    //remove spaces + return changed class atribute
    public String removeSpaces(){
        String temp = "";
        for (int i = 0; i < this.string.length(); i++) {
            if (!this.string.substring(i, i + 1).equals(" ")) {
                temp += this.string.substring(i, i + 1);
            }
        }
        this.string = temp;
        return this.string;

    }
    //alternate case + return changed class atribute
    public String alternateCase(){
        String temp = "";
        for (int i = 1; i <= this.string.length(); i++) {
            String currentChar = this.string.substring(i - 1, i);
            if (i % 2 == 0) {
                currentChar = currentChar.toUpperCase();
            } else {
                currentChar = currentChar.toLowerCase();
            }
            temp += currentChar;
        }
        this.string = temp;
        return this.string;
    }
    //method that removes every other + return changed class atribute
    public String reduceLength(){
        String temp = "";
        for (int i = 0; i < this.string.length(); i += 2) {
            temp += this.string.substring(i, i + 1);
        }
        this.string = temp;
        return this.string;

    }
}
