import java.util.Scanner;

public class Metodos {
    public ObjCoche[][] LlenarMatriz(ObjCoche[][] m) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                ObjCoche o = new objCoche();
                System.out.println("Ingrese el color del vehiculo");
                o.setColor(sc.next());
                System.out.println("Ingrese el color del vehiculo");
                o.setMarca(sc.next());
                System.out.println("Ingrese el color del vehiculo");
                o.setCilindraje(sc.nextInt());
                m[i][j] = o;
            }
        }
        return m;
    }
    public void MostrarMatriz()
}
