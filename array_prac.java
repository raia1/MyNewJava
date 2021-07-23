public class array_prac {
    public static void main(String[] args) {
        float[] marks = {44, 67, 89, 34, 20};
        float num = 100;
        boolean isInArray = false;
        for (float element : marks) {
            if (num == element) {
                isInArray = true;
                break;
            }

        }
        if (isInArray) {
            System.out.println("the value is present");
        } else {
            System.out.println("not present");
        }
    }
}
