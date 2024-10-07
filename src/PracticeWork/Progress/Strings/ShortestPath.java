package PracticeWork.Progress.Strings;

import java.util.*;

public class ShortestPath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("Guide how to use this program ::");
        System.out.print("Entered Path is : " + path + "\n");
        System.out.println("Here,\nE stands for East -----> (right) x++\nW stands for West <----- (left) x--\nN stands for North ^ (up) y++\nS stands for South (down) y--");
        System.out.println("Shortest distance for Path " + path + " is : " + ShortestPath(path));
        Scanner tush = new Scanner(System.in);

        System.out.println();
        System.out.println("Now , You can give Path ::");
        String path2 = SetString();
        GetString(path2);
        System.out.println();
        System.out.println("Shortest distance for Path " + path2 + " is : " + ShortestPath(path2));
    }

    public static String SetString() {
        Scanner tush = new Scanner(System.in);
//        int num = tush.nextInt();
//        for (int i = 0 ; i < 20 ; i++){
//        switch (num){
//            case 1 :
//                    System.out.print("N");
//                 break;
//
//            case 2 :
//                    System.out.print("E");
//
//                break;
//
//            case 3 :
//                System.out.print("S");
//                break;
//
//            case 4 :
//                System.out.print("W");
//                break;
//            default:
//                System.out.println("PLease Re-Read User Manual . Thankyou! ");
//          break;
//        }}
        System.out.println("(1). Enter N for North (up) \n(2). Enter E for East (right) \n(3). Enter S for South (down) \n(4). Enter W for West (left)");
        System.out.print("Enter Path : ");
        String path2 = tush.nextLine();
        return path2;
    }

    public static void GetString(String path2) {
        System.out.print("Entered Path is : " + path2);
    }


    public static float ShortestPath(String path) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            // North (up)
            if (dir == 'N') {
                y++;
            }

            // East (right)
            if (dir == 'E') {
                x++;
            }

            // South (down)
            if (dir == 'S') {
                y--;
            }

            // West (left)
            if (dir == 'W') {
                x--;
            }


        }
        int x2 = (x * x);
        int y2 = (y * y);
        float sqrt = (float) Math.sqrt(x2 + y2);

        return (float) sqrt;
    }

}
