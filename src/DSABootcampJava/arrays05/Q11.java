package DSABootcampJava.arrays05;

import java.util.List;

public class Q11 {
    public static void main(String[] args) {
        List<List<String>> items = List.of(List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone"));
        String ruleKey = "color", ruleValue = "silver";
        System.out.println("input" + items.toString() + "\truleKey=" + ruleKey + " rulevalue" + ruleValue);
        System.out.println("Output : " + countMatchesMethod1(items, ruleKey, ruleValue));
        System.out.println("Output : " + countMatchesMethod2(items, ruleKey, ruleValue));
    }

    public static int countMatchesMethod1(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int beg = 0;
        int end = items.size() - 1;
        while (beg <= end) {

            if (checkkeyVal(items.get(beg), ruleKey, ruleValue) == true)
                count++;
            if (beg == end) {
                return count;
            }
            if (checkkeyVal(items.get(end), ruleKey, ruleValue) == true)
                count++;

            beg++;
            end--;
        }

        return count;
    }

    static boolean checkkeyVal(List<String> item, String ruleKey, String ruleValue) {
        switch (ruleKey) {
            case "type":
                return (item.get(0)).equals(ruleValue);

            case "color":
                return (item.get(1)).equals(ruleValue);

            case "name":
                return (item.get(2)).equals(ruleValue);
            default:
                return false;
        }
    }

    public static int countMatchesMethod2(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (var i : items) {
            if (checkkeyVal(i, ruleKey, ruleValue) == true)
                count++;
        }

        return count;
    }
}
