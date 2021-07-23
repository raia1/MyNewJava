public class Array2 {
    public static void main(String[] args) {
        int[]marks=new int[5];

//        for (int i=marks.length;i>=0;i++){
//            System.out.println(i);
//        }
        //printing using for each loop

        marks[0]=56;
        marks[1]=77;
        marks[2]=79;
        marks[3]=90;
        marks[4]=40;
        for(int element: marks){
            System.out.println(element);
        }

    }
}
