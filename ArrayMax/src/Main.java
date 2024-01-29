import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        int arr[] = new int[size];
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The maximum value is = " + max);
    }
}