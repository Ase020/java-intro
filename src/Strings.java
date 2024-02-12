public class Strings {
    public static void main(String[] args){
        char percenSign = '%';
        String percent = "Felix Olali";
        String newString = new String("New String");

        String literalString1 = "abc";
        String literalString2 = "abc";

        String objectString1 = new String("xyz");
        String objectString2 = new String("xyz");
//        System.out.println(literalString1 == literalString2); // true
//        System.out.println(objectString1 == objectString2); // false

        String name = "John Wick";
        String country = "Romania";
        int age = 25;
        String occupation = "assassin";
        double weight = 67.2;
        boolean amIHuman = true;
        String formmatedString = String.format("My name is %s, I'm %d years old from %s and I'm an %s weighing %fkgs. 100%c %b", name, age, country, occupation, weight, percenSign, amIHuman);

//        System.out.println("Hello world, I'm " + name + " from " + country + ".");
//        System.out.println(formmatedString);

//        System.out.println(name.length()); // calculate length of a string
//        System.out.println(name.isEmpty()); // check if is empty
//        System.out.println(name.toLowerCase());

        String newStr = "The sky is blue";

        System.out.println(newStr.replace("blue", "red"));
System.out.println(newStr.contains("red"));

    }
}
