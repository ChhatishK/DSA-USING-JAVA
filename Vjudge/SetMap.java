package Vjudge;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class SetMap {
    public static void chefOfTheYear() {

    }

    // Anagram's easy
    public static String isAnagram(String s, String t) {
        int n;
        int freqTable[] = new int[256];

        for(int i=0; i<s.length(); i++){
            freqTable[s.charAt(i)]++;
        }

        for(int i=0; i<t.length(); i++){
            freqTable[t.charAt(i)]--;
        }

        for(int i=0; i<256; i++){
            if(freqTable[i] != 0){
                return "False";
            } 
        }
        return "True";
    }

    // First repeating character
    static char isRepeated(String str) {
        
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            for (int j=i+1; j<str.length(); j++) {
                if (ch == str.charAt(j)) {
                    return ch;
                }
            }
        }
        
        return '.';
        
    }

    // Find missing number 
    public static void findMissingNumber(int a[] , int b[]) {
        ArrayList<Integer> missing = new ArrayList<>();
        for (int i=0; i<a.length; i++) {
            int flag = 1;
            for (int j=0; j<b.length; j++) {
                if (a[i] == b[j]) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if (flag == 1) {
                missing.add(a[i]);
            }
        }

        for (int i=0; i<missing.size(); i++) {
            System.out.print(missing.get(i)+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Missing number
        int n  = scan.nextInt();
        int m = scan.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for (int i=0; i<n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i=0; i<m; i++) {
            b[i] = scan.nextInt();
        }

        findMissingNumber(a, b);
        // HashMap<String, String> Country_chef = new HashMap<>();
        // HashMap<String, Integer> Country_votes = new HashMap<>();
        // HashMap<String, Integer> Chef_votes = new HashMap<>();

        // for (int i=0; i<n; i++) {
        //     String Chef_name = scan.next();
        //     String country_name = scan.next();
        //     scan.nextLine();
        //     Country_chef.put(Chef_name, country_name);
        //     Chef_votes.put(Chef_name, 0);
        //     Country_votes.put(country_name, 0);

        // }

        // for (int i=0; i<m; i++) {
        //     String chef_name = scan.next();
        //     Chef_votes.put(chef_name, Chef_votes.get(chef_name)+1);

        //     String Country_name = Country_chef.get(chef_name);
        //     Country_votes.put(Country_name, Country_votes.get(Country_name)+1);


        // }

        // String winner_Chef = null;
        // int curr_max_votes = -1;
        // for (Map.Entry<String, Integer> entry : Chef_votes.entrySet()) {
        //     String chef_name = entry.getKey();
        //     int num_of_votes = entry.getValue();
        //     if (num_of_votes > curr_max_votes || (num_of_votes == curr_max_votes &&  chef_name.compareTo(winner_Chef) < 0)) {
        //         curr_max_votes = num_of_votes;
        //         winner_Chef = chef_name;
        //     }
        // }
        // String WinnerCountry = null;
        // int CountryVotes = -1;
        // for (Map.Entry<String, Integer> entry : Country_votes.entrySet()) {
        //     String countryName = entry.getKey();
        //     int num_of_votes = entry.getValue();
        //     if (num_of_votes > CountryVotes || (CountryVotes == num_of_votes && countryName.compareTo(WinnerCountry) < 0)) {
        //         CountryVotes = num_of_votes;
        //         WinnerCountry = countryName;
        //     }
        // }

        // System.out.println("Winner Country : "+WinnerCountry);
        // System.out.println("Winner Chef : "+winner_Chef);
    }
}