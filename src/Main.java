public class Main {
    public static void main(String[] args) {
        int [] array = new int [3];
        array [0] = 1;
        array [1] = 2;
        array [2] = 3;
        float [] secondArray = {1.57f, 7.654f, 9.986f};
        short [] thirdArray = {2024, 7, 11, 19, 57};
        System.out.println("Example2");
        for (int index = 0; index < array.length; index++) {
            if (index == array.length - 1) {
                System.out.println(array[index]);
                break;
            }
            System.out.print(array[index] + ", ");
        }
        for (int index = 0; index < secondArray.length; index++) {
            if (index == secondArray.length - 1) {
                System.out.println(secondArray[index]);
                break;
            }
            System.out.print(secondArray[index] + ", ");
        }
        for (int index = 0; index < thirdArray.length; index++) {
            if (index == thirdArray.length - 1) {
                System.out.println(thirdArray[index]);
                break;
            }
            System.out.print(thirdArray[index] + ", ");
        }
        System.out.println("Example3");
        int arraySize = array.length;
        for (int index = arraySize - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(array[index]);
                break;
            }
            System.out.print(array[index] + ", ");
        }
        int secondArraySize = secondArray.length;
        for (int index = secondArraySize - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(secondArray[index]);
                break;
            }
            System.out.print(secondArray[index] + ", ");
        }
        int thirdArraySize = thirdArray.length;
        for (int index = thirdArraySize - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(thirdArray[index]);
                break;
            }
            System.out.print(thirdArray[index] + ", ");
        }
    }
}