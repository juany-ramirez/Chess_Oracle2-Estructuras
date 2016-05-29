package javaapplication11;

/**
 *
 * @author Admin
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodo2();
        /*
        bhorse_wt
        wpawn_wt
        wking_wt
        */
    }

    public static void Metodo1(){
        int num = 65;
        String nombrePieza = "wking_bt";
        for (int i = 0; i < 2; i++) {
            if(i==0){
                System.out.println("if (rb_blanco.isSelected()) {//caballos blancos");
                System.out.println("pieza.setColor(\"B\");");
            }else{
                System.out.println("else {//caballos negros");
                System.out.println("pieza.setColor(\"N\");");
                nombrePieza = "bking_bt";
            }
            for (int j = 0; j < 8; j++) {
                System.out.println("    if (fila == '" + ((char) (num + j)) + "') {");
                System.out.println("    pieza.getPosicion().setX(" + j + ");");
                for (int k = 0; k < 8; k++) {
                    if (k == 0) {
                        System.out.println("        if (columna == '" + (k + 1) + "') {");

                    } else {
                        System.out.println("        } else if (columna == '" + (k + 1) + "') {");
                    }
                    System.out.println("            lb_" + ((char) (num + j)) + (k + 1) + ".setIcon(" + nombrePieza + ");");
                    System.out.println("            pieza.getPosicion().setY(" + k + ");");
                    System.out.println("            tablero.add(pieza.getPosicion().getX(), pieza.getPosicion().getY(), pieza);");
                }
                System.out.println("        }");
                System.out.println("}");
            }
            System.out.println("}");
        }
    }
    
    public static void Metodo2(){
        int num = 65;
        String nombrePieza = "wking_wt";
        for (int i = 0; i < 2; i++) {
            if(i==0){
                System.out.println("if (rb_blanco.isSelected()) {//caballos blancos");
                System.out.println("pieza.setColor(\"B\");");
            }else{
                System.out.println("else {//caballos negros");
                System.out.println("pieza.setColor(\"N\");");
                nombrePieza = "bking_wt";
            }
            for (int j = 0; j < 8; j++) {
                System.out.println("    if (fila == '" + ((char) (num + j)) + "') {");
                for (int k = 0; k < 8; k++) {
                    if (k == 0) {
                        System.out.println("        if (columna == '" + (k + 1) + "') {");

                    } else {
                        System.out.println("        } else if (columna == '" + (k + 1) + "') {");
                    }
                    System.out.println("            lb_" + ((char) (num + j)) + (k + 1) + ".setIcon(" + nombrePieza + ");");
                    System.out.println("            pieza.setPosicion(new Posicion(" + j + " , " + k + "));");
                    System.out.println("            tablero.add(" + j + ", " + k + ", pieza);");
                }
                System.out.println("        }");
                System.out.println("}");
            }
            System.out.println("}");
        }
    }
}
