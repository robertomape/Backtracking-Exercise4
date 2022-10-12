public class Algoritmo {
    public void hayrepartoEquitativo(int[] bienes,int[] hijos,int nivel,Booleano exito){
        if(nivel == bienes.length){
            if(igualdad(hijos)==1){
                exito.setValor(true);
                System.out.println("True");
                imprimirSol(hijos);
            }
        }
	else{
            int c=0; // candidatos o hijos
            while( !exito.getValor() && (c<3)){
                // Aquí no pongo un if porque mi idea es almacenar si o si, y si un hijo se queda contodo no será solución por lo que no supondría problema.
                    hijos[c] = hijos[c] + bienes[nivel];
                    nivel = nivel + 1;
                    hayrepartoEquitativo(bienes, hijos, nivel, exito);
                    if (!exito.getValor()) {
                        nivel = nivel - 1;
                        hijos[c] = hijos[c] - bienes[nivel];
                    }
                c++;
            }
        }
    }

    // Función para saber si los bienes han sido repartidos en partes iguales
    public int igualdad(int[] array){
        int suma1=array[0];;
        int suma2=array[1];
        int suma3=array[2];
        if(suma1 == suma2 && suma2==suma3){
            return 1;
        }
        else {
            return 0;
        }
    }
    public void imprimirSol(int[] array){
        int suma1=array[0];;
        int suma2=array[1];
        int suma3=array[2];
        System.out.println("La solución es:"+ suma1 + " , " + suma2 + " , " + suma3);
    }
}
