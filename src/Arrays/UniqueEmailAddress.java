package Arrays;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {

    public static void main(String[] args){
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int result = getUniqueAddress(emails);
        System.out.println(result);

    }
    public static int getUniqueAddress(String[] emails){
        Set<String> uniqueSet = new HashSet<>();
        for(String s : emails){
            StringBuilder sb = new StringBuilder();
            int at = s.indexOf('@');
            for(int i = 0 ; i < at; i++){
                char ch = s.charAt(i);
                if(ch == '+')
                    break;
                if(ch != '.')
                    sb.append(ch);
            }
            sb.append(s.substring(at));
            uniqueSet.add(sb.toString());
        }
        System.out.println(uniqueSet);
        return uniqueSet.size();
    }
}
