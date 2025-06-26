public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

//     *
//    * *
//   * * *
//  * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *