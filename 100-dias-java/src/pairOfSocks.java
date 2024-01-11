import java.util.HashMap;
import java.util.Map;

public class pairOfSocks {
    public static void main(String[] args) {
        System.out.println(sockPairs("CABBACCC"));
    }
    public static int sockPairs(String socks){
        Map<Character, Integer> socksCount = new HashMap<>();
        for(char sock: socks.toCharArray()){
            socksCount.put(sock, socksCount.getOrDefault(sock, 0) + 1);
        }
        int pairs = 0;
        for(int count : socksCount.values()){
            pairs += count / 2;
        }
        return pairs;
    }
}
