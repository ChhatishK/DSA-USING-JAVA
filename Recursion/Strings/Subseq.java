import java.util.*;

public class Subseq {
    public static void main(String args[]) {
        // subseq("", "abc");
        ArrayList<String> ans = subseqList("", "abc");
        System.out.println(ans);
    }

    static void subseq(String p, String up) {
        if (up.length() == 0) {
            System.out.println(p);
            return;
        }

        subseq(p+up.charAt(0), up.substring(1));
        subseq(p, up.substring(1));
    }


    static ArrayList<String> subseqList(String p, String up) {
        if (up.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        ans.addAll(subseqList(p+up.charAt(0), up.substring(1)));
        ans.addAll(subseqList(p, up.substring(1)));

        return ans;
    }
}