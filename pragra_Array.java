public class pragra_Array {
    public static void main(String[] args) {
        int aim[][]={{1,3,4},{5,7,2},{8,7,9},{6,8,4},{6,1,3}};
        int rows=aim.length;
        int cols=aim[0].length;
        for(int i=0;i<cols;i++){
            int sum=0;
            for(int j=0;j<rows;j++){
                sum=sum+aim[j][i];

            }

            System.out.println("sum of "+(i+1)+" column:"+sum);
        char array[]={'a','k','a'};
        String str=new String(array);

        }
        String m=new String("hello");
        String m2="hello";
        String m3="hello";
        if (m2==m3){
            System.out.println("m2==m3 "+"true");

        }
        else{
            System.out.println("m2==m3 "+"false");
        }

    }
}
