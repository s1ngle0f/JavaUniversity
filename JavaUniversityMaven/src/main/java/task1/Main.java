package task1;

public class Main {

    static void punct3( int[] array ) {
        System.out.print("Punct 3: ");
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum+=array[i];
        }
        System.out.print(sum + " ");
        sum = 0;
        int whl = 0;
        while (whl < array.length){
            sum+=array[whl];
            whl++;
        }
        System.out.print(sum + " ");
        whl = 0;
        sum = 0;
        do{
            sum+=array[whl];
            whl++;
        }while(whl < array.length);
        System.out.println(sum + " ");
    }

    static void punct4( String[] array ) {
        System.out.print("Punct 4: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void punct5() {
        System.out.print("Punct 5: ");
        for (float i = 1; i <= 10; i++){
            System.out.print(String.format("%.2f", 1/i) + " ");
        }
        System.out.println();
    }

    static void punct6() {
        System.out.print("Punct 6: ");
        int count = (int) Math.round(Math.random()*100);
        int a[] = new int[count];
        for (int i = 0; i < count; i++){
            a[i] = (int) Math.round(Math.random()*100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void punct7(int fuck) {
        System.out.print("Punct 7: ");
        int count = (int) Math.round(Math.random()*100);
        int a = 1;
        for (int i = 2; i <= fuck; i++){
            a *= i;
        }
        System.out.println(a);
    }

    static void punct8() {
        System.out.print("Punct 8: ");
        int count = (int) Math.round(Math.random()*100);
        int a[] = new int[count];
        for (int i = 0; i < count; i++){
            a[i] = (int) Math.round(Math.random()*100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 3, 5, 7};
        String[] arrStr = {"One", "Two"};
        punct3(arr);
        punct4(arrStr);
        punct5();
        punct6();
        punct7(3);
    }
}
