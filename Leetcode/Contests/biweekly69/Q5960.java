package Contests.biweekly69;
//5960. Capitalize the Title

public class Q5960 {
    public static String capitalizeTitle(String title) {
        title = title + " ";
        StringBuilder wrd = new StringBuilder();
        String cap = "";
        for (int i = 0; i < title.length(); i++) {
            if(title.charAt(i) == 32)
            {
                if(wrd.length() > 2)
                    cap += Character.toUpperCase(wrd.charAt(0)) + wrd.substring(1).toLowerCase() + " ";
                else
                    cap += wrd.toString().toLowerCase() + " ";
                wrd = new StringBuilder();
            }
            else
                wrd.append(title.charAt(i));
        }
        
        return cap.substring(0,cap.length()-1);
    }

    public static void main(String[] args) {
        String title = "i lOve leetcode";
        String capitalizedTitile = capitalizeTitle(title);
        System.out.println(capitalizedTitile);
    }
}
