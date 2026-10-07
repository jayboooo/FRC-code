public class Print {
    public static void main(String[] args) {
        Boolean run = true;
        int count = 1;
        while(run){
            System.out.println(count);
            count +=2;
            if(count >= 1000){
                break;
            }
        }

        for(int i = 0; i < 1000; i +=2){
            System.out.println(i);
        }
    }
}
