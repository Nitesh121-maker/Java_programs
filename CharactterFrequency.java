
public class CharactterFrequency {
    public static void main(String[] args){
        String str = "Hello Nitesh";
        char target = 'h';

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count ++;
            }
        }
        System.out.println("Frequency of the chharcter in given string: "+count);
    }
}
