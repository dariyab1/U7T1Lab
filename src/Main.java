import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> trees = new ArrayList<String>();
        trees.add("pine");
        trees.add("maple");
        trees.add("frasier fir");
        System.out.println(trees.size());
        System.out.println(trees);

        System.out.println(trees.get(1));


        ArrayList<String> names = new ArrayList<String>();
        names.add("Ben");
        names.add("Andy");
        names.add("David");
        String[] moreNames = {"Crystal", "Monica", "Toby", "Nancy"};
        int namesAmt = names.size();
        int moreNamesAmt = moreNames.length;
        int thirdNameLength = (names.get(2)).length();
        int secondNameLength = moreNames[1].length();
        int lengths = namesAmt + moreNamesAmt + thirdNameLength + secondNameLength;
        System.out.println(lengths); // should print 18
    }
}