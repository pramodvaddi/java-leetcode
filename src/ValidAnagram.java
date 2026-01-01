// Time Complexity: O(n) - toLowerCase() and replace() uses O(n)
// Space Complexity: O(1) - Uses a fixes array size of 26.
public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "Dormitory";
        String s2 = "Dirty Room";
        System.out.println(isAnagram(s1,s2));
    }
    static boolean isAnagram(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ", "");

        int[] bucket = new int[26];

        for(int i = 0; i < s1.length(); i++){
            bucket[s1.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s2.length(); i++){
            bucket[s2.charAt(i) - 'a']--;
        }

        for(int count: bucket){
            if(count != 0){
                return false;
            }

        }
        return true;
    }
}


