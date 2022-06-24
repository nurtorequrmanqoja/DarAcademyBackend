public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] charS = s.toCharArray();
        int n = charS.length;
        String res = "";
        int index = 0;
        while (index < n){
            for (int i = 0; i < n; i++){
                if (indices[i] == index){
                    res += charS[i];
                }
            }
            index++;

        }
        return res;

    }
}
