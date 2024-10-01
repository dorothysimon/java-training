package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] week = {"monday", "thuesday", "wednesday", "friday", "saturday", "sunday"};

        System.out.println("2nd day of the week: " + week[1]);
        System.out.println("Days/week: " + week.length);

        int[] a = new int[5];
        a[0] = 1;
        System.out.print(a[0]+" ");
        for (int i = 1; i < a.length; i++){
            a[i]=a[i-1]*2;
            System.out.print(a[i]+" ");
        }
        System.out.println();
        boolean[] b = new boolean[6];
        b[0] = false;
        System.out.print(b[0]+" ");
        for (int i = 1; i < b.length; i++){
            b[i]=!b[i-1];
            System.out.print(b[i]+" ");
        }
    }
}
