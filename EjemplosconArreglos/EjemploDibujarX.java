public class EjemploDibujarX {
  public static void main(String[] args) {
    int n = 5;
    int end = n;
    int start = 0;
    int loop = n;

    char drawX[][] = new char[n][n];

    for (int i = 0; i < drawX.length; i++) {
      for (int j = 0; j < drawX.length; j++) {
        if (i == n - loop) {
          if (j == start || j == end - 1) {
            drawX[i][j] = 'x';
          } else {
            drawX[i][j] = '-';
          }
        }
      }
      end--;
      start++;
      loop--;
    }
    for (int i = 0; i < drawX.length; i++) {
      for (int j = 0; j < drawX.length; j++) {
        System.out.print(drawX[i][j]);
      }
      System.out.println();
    }

    
      /*int cola=n;
      int punta=0;
      for ( int i=0; i < n ;i++){
      for (int j=0; j<n;j++){
      if(j==cola-1 || j==punta)
      {System.out.print('X');}
      else
      {System.out.print('_');}
      }
      System.out.println();
      cola--;
      punta++;
      }*/
     
  }
}
