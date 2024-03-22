package clase_arrays_multidimensionales;

public class multidimension {

}
 
int a=10;
int [] b=new int[2];
int [][] c=new int[4][];


b[0]=a;  //ok
c[0][1]=a; // Incorrecto, segunda dimensión sin tamaño
c[0]=b[1]; // Incorrecto, 
c[1]=b;  //  OK
b[3]=20; // Incorrecto, IndexOutOfBoundsException
c[2]=new int[]{2,3,1};  // Ok 