public class Loop {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            System.out.println("i = " + i);
        }
        System.out.println("----------------------");
        int[] numbers = {0,1,2,3,4,5,6};
        for(int i = 0; i < numbers.length; i++){
            System.out.println("number = " + numbers[i]);
        }
        System.out.println("----------------------");
        int i = 0;
        while (i < numbers.length){
            System.out.println("number = "+ numbers[i]);
            i++;
        }
        System.out.println("----------------------");
        for(int j = 0; j < numbers.length; j++){
            int n =  numbers[j];
            if(n%2==0){
                System.out.println("even number = " + n);
            } else if (n == 3){
                System.out.println("number is Three");
            } else {
                System.out.println("odd number = " + n);
            }
        }
    }
}
