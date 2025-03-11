// Remove space using regex with replaceAll function

public class RemoveSpace {
    public static void main(String[] args){
        String str = " Hello Nitesh ";
        String result = str.replaceAll("\\s", "");
        System.out.println("String without spaces: " + result);
    }
}
