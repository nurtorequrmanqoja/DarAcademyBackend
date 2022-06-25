public class NumberSteps {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num > 0){
            if (num == 1){
                num--;
                count++;
                break;
            }
            else if (num % 2 == 0){
                num =  num / 2;
                count++;
            }
            else if (num % 2 == 1){
                num--;
                count++;
            }
        }
        return count;

    }
}
