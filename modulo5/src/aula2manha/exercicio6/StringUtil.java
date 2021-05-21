package aula2manha.exercicio6;

public class StringUtil {

    public static String rpad(String s, char c, int n){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);

        for (int i = 0; i < n; i++) {
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }

    public static String lpad(String s, char c, int n){

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            stringBuilder.append(c);
        }

        stringBuilder.append(s);

        return stringBuilder.toString();
    }

    public static String ltrim (String s){
        String sub = null;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                sub = s.substring(i);
                break;
            }
        }

        return sub;
    }

    public static String rtrim (String s){

        String sub = null;
        for(int i = s.length(); i > 0; i--){
            if(s.charAt(i) != ' '){
                sub = s.substring(0,i);
                break;
            }
        }

        return sub;

    }

    public static String trim(String s){

        String sub = null;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                sub = s.substring(i);
                break;
            }
        }

        for(int i = sub.length(); i > 0; i--){
            if(s.charAt(i) != ' '){
                sub = s.substring(0,i);
                break;
            }
        }

        return sub;

    }

    public static int indexOfN (String s, char c, int n){

        int count = 0;
        int position = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                count ++;
                if(count == n){
                    position = i;
                    break;
                }
            }
        }

        if(count != n){
            return -1;
        }

        return count;

    }
}
