public class pracarray3 {
    public static void main(String[] args) {
        float []marks={19,55,67,89,90};
        float sum=0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println("the value of avg="+sum/marks.length);

    }
}
