public class CheckToString {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String string1 = "", string2 = "";

        for (String s: word1){
            string1 += s;
        }
        for (String s: word2){
            string2 += s;
        }
        if (string1.equals(string2))return true;
        else return false;
    }

}
