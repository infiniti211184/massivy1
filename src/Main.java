import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //пример программы по наличию фруктов в магазине.
        String[] arrFruits = new String[5];
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < arrFruits.length; i++) {
            arrFruits[i] = "fruit" + i;
            System.out.println(arrFruits[i]);
        }
    System.out.print('Enter fruit name: ');
        String fruitName = scn.next();
        boolean isExist = false;
        for (int i = 0; i < arrFruits.length; i++) {
            if (arrFruits[i].equals(fruitName)) {
                System.out.println (fruitName +" есть в наличии");
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("Фрукт не найден ");
        }

// Задание 1.
        public class Main {
            public static void main(String[] args) {
                //Задание 1.
                int[] n = {1, 2, 3};
                for (int x = 0; x <= 3; x++)
                    System.out.println(n[x]);
            }
        }

//пробный код, печатает одни нули
        public class Main {
            public static void main(String[] args) {
                int[] arr = new int[5];
                for (int i = 0; i < 5; i++)
                    System.out.println(arr[i]);
            }

            // задача из интернета
            public class Main {
                public static void main(String[] args) {
                    String[] arrFruits = new String[5];
                    Scanner scn = new Scanner(System.in);
                    for (int i = 0; i < arrFruits.length; i++) {
                        arrFruits[i] = "fruit " +i;
                        System.out.println(arrFruits[i]);

                    }
                }
            }
        }

        public class Main {
            public static void main(String[] args) {
                //адание 1.
                int[] array1 = new int[3];
                array1[0] = 1;
                array1[1] = 2;
                array1[2] = 3;
                for (int i = 0; i < array1.length; i++) ;

                double[] array2 = {1.57, 7.654, 9.986};
                boolean[] array3 = {true, false};
                System.out.println();
            }
        }


        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
            if(i!=array1.length-1) {
                System.out.println(", ");
            }
        }
        System.out.prinln();
        for (int i = 0; i < array2.length; i++){
            System.out.println(array1[i]);
            if(i!=array2.length-1) {
                System.out.println(", ");
            }
        }
        System.out.prinln();
        for (int i = 0; i < array3.length; i++){
            System.out.println(array1[i]);
            if(i!=array3.length-1) {
                System.out.println(", ");
            }
        }


        //задание 3.
        for (int i = array1.length-1; i >=0; i++) {
            System.out.print(array1[i]);
            if (i != 0) {
                System.out.println(", ");
            }
        }
        System.out.println();
        fof (int i = array2.length-1; i >= 0; i++) {
            System.out.print(array2[i]);
        }
