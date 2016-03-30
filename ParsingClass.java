
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class ParsingClass {

    static TreeSet<String> set = new TreeSet<String>();
    static TreeSet<String> setOfNouns = new TreeSet<String>();
    static HashSet<String> setOfVerbs = new HashSet<String>();
    static HashSet<String> setOfAdjs = new HashSet<String>();
    static TreeSet<String> setOfPreps = new TreeSet<String>();

    public static String method(String[] words) {
        String pSt = "";

        for (int i = 0; i < words.length; i++) {
            set.add(words[i].toLowerCase());
        }
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            pSt += "-" + itr.next() + "\n";
        }
        return pSt;
    }

    public static String methodClassification() {

        Iterator<String> itr = set.iterator();
        String returnedStr = "The prepositions(прийменники):\n";
        String equalitySt = "";
        while (itr.hasNext()) {
            equalitySt = itr.next();
            if (equalitySt.length() <= 2) {
                returnedStr += equalitySt + "\n";
                setOfPreps.add(equalitySt);
                itr.remove();                       
            }
        }
        
        returnedStr += "\n\nThe Verbs(дієслова):\n";
        equalitySt = "";
        Iterator<String> itr3 = set.iterator();
        while (itr3.hasNext()) {
            equalitySt = itr3.next();
            if ((equalitySt.charAt(equalitySt.length() - 2) == 'n')&&(equalitySt.charAt(equalitySt.length() - 1) == 'g') || (equalitySt.charAt(equalitySt.length() - 2) == 'e') && (equalitySt.charAt(equalitySt.length() - 1) == 'd')|| (equalitySt.charAt(equalitySt.length() - 2) == 'n') && (equalitySt.charAt(equalitySt.length() - 1) == 'e')|| (equalitySt.charAt(equalitySt.length() - 2) == 'a') && (equalitySt.charAt(equalitySt.length() - 1) == 'y')) {
                returnedStr += equalitySt + "\n";
                setOfVerbs.add(equalitySt);
                itr3.remove();
            }
        }
        
        returnedStr += "\n\nThe Adjectives(прикметники):\n";
        equalitySt = "";
        Iterator<String> itr4 = set.iterator();
        while (itr4.hasNext()) {
            equalitySt = itr4.next();
            if ((equalitySt.charAt(equalitySt.length() - 2) == 'l')&&(equalitySt.charAt(equalitySt.length() - 1) == 'y') ) {
                returnedStr += equalitySt + "\n";
                setOfAdjs.add(equalitySt);
                itr4.remove();
            }
        }
        
        
        returnedStr += "\n\nThe Nouns(іменники):\n";
        equalitySt = "";
        Iterator<String> itr2 = set.iterator();
        for(String st: set){
            returnedStr+= st + "\n";
        }
        
        return returnedStr;
    }
}
