public class array {
    public static void main(String args[]) {
      int [][] x=new int[][]{{1,2},{3,4,5},{6}, {7, 8, 9, 10 ,11}};
      for(int i=0;i<x.length; i++)
        {
         for(int j=0;j<x[i].length; j++)
          {
          System.out.print(x[i][j] + "  ");
          }
      System.out.println();
        }
    }
}