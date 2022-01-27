package LinearSearch;

public class SearchInString {

    public static void main(String[] args) {
        String name = "Aman";
        char target = 'a';
        System.out.println(searchInString(name, target));
    }

    static boolean searchInString(String str, char target){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

}
