package test;

public class funcClass {
        public static int a;
        public int b;
        public int c;


        public int max() {
            int aux;
            if (a > b && a > c) {
                aux = a;
            } else if (b > c) {
                aux = b;
            } else {
                aux = c;
            }
            return aux;
        }

        public static void showResult(int value) {
            System.out.println("higher = " + value);
        }
    }