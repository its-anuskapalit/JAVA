////DAY7
/*1
45
789*/
//public class online {
//    public static void main(String args[]) {
//        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if (i>=j) {
//                    System.out.print(arr[i][j]);
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//                System.out.println();
//
//        }
//    }
//}

////EVEN
//public class online {
//    public static void main(String args[]) {
//        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if (arr[i][j]%2==0) {
//                    System.out.print(arr[i][j]);
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//        }
//    }
//}

////RELACE NEGATIVE NUBERS WITH ZEROS
//public class online {
//    public static void main(String args[]) {
//        int arr[][] = {{3, -5, 9}, {-1, 2, 7}, {-8, -7, 1}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if (0>arr[i][j]) {
//                    arr[i][j]=0;
//
//        }
//    }
//}
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}

////sum of each row
//public class online {
//    public static void main(String args[]) {
//        int arr[][] = {{3, -5, 9}, {-1, 2, 7}, {-8, -7, 1}};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                sum = sum + arr[i][j];
//            }
//            System.out.println("Sum:" + sum);
//            sum = 0;
//        }
//    }
//}

////sum of each column
//public class online {
//    public static void main(String args[]) {
//        int arr[][] = {{3, -5, 9}, {-1, 2, 7}, {-8, -7, 1}};
//        int sum = 0;
//        for (int j = 0; j < arr[0].length; j++) {
//            for (int i = 0; i < arr.length; i++) {
//                sum = sum + arr[i][j];
//            }
//            System.out.println("Sum:" + sum);
//            sum = 0;
//        }
//    }
//}
////min
//public class online {
//    public static void main(String args[]) {
//        int arr[][] = {{3, -5, 9}, {-1, 2, 7}, {-8, -7, 1}};
//        int min=arr[0][0];
//        for (int i = 0; i < arr[0].length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//
//                if (min > arr[i][j]) {
//                    min=arr[i][j];
//                }
//
//                }
//            }
//        System.out.println(min);
//        }
//    }

////max
//public class online {
//    public static void main(String args[]) {
//        int arr[][] = {{3, -5, 9}, {-1, 2, 7}, {-8, -7, 1}};
//        int m=arr[0][0];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if (m > arr[i][j]) {
//                    m = arr[i][j];
//                    System.out.println(m);
//                }
//            }
//                m=0;
//
//            }
//        }
//    }

//mini of each row
//public class online {
//    public static void main(String args[]) {
//        int arr[][] = {{3, -5, 9}, {-1, 2, 7}, {-8, -7, 1}};
//        for (int i = 0; i < arr.length; i++) {
//            int m = arr[i][0];
//            for (int j = 0; j < arr[0].length; j++) {
//                if (m > arr[i][j]) {
//                    m=arr[i][j];
//
//                }
//            }
//            System.out.println(m);
//        }
//    }
//}

//JAGGED ARRAY
//public class online {
//    public static void main(String args[]) {
//        int a1[][] = new int[3][];
//        /*a1[0]=new int[4];
//        a1[1]=new int[2];
//        a1[2]=new int[3];*/
//        int arr[][] = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]);
//
//            }
//            System.out.println();
//
//        }
//    }
//}
