import java.util.HashMap;
import java.util.UUID;
import java.util.*;
public class Day19 {

    public static void main(String[] args) {
        URLShortener urlShortener = new URLShortener();

        String url1 = "https://www.example.com/very/very/long/url/could/be/here.php";
        String url2 = "https://www.anotherexample.com/another/very/long/url.php";

        // Test shorten url:
        System.out.println("Test shorten url:");
        String shortURL1 = urlShortener.shortenUrl(url1);
        String shortURL2 = urlShortener.shortenUrl(url2);
        System.out.println("Short URL for " + url1 + " is " + shortURL1);
        System.out.println("Short URL for " + url2 + " is " + shortURL2);

        // Test restore url:
        System.out.println("\nTest restore url:");
        System.out.println("Original URL for " + shortURL1 + " is " + urlShortener.restoreUrl(shortURL1));
        System.out.println("Original URL for " + shortURL2 + " is " + urlShortener.restoreUrl(shortURL2));
    }

    public static class URLShortener {
        // We'll use a HashMap for our storage
        private HashMap<String, String> keyToUrl = new HashMap<>();
        private HashMap<String, String> urlToKey = new HashMap<>();
        private String domain = "http://www.short.com/";

        // Method to shorten a URL
        public String shortenUrl(String url) {
            String shortURL = urlToKey.get(url);
            if (shortURL == null) {
                shortURL = UUID.randomUUID().toString().substring(0, 8);
                while (keyToUrl.containsKey(shortURL)){
                    shortURL = UUID.randomUUID().toString().substring(0, 8);
                }
                keyToUrl.put(shortURL, url);
                urlToKey.put(url, shortURL);
            }
            return domain + shortURL;
        }

        //Method to restore url from shortURL
        public String restoreUrl(String shortURL) {
            String key = shortURL.replace(domain, "");
            return keyToUrl.get(key);
        }
    }
}