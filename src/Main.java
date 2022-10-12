public class Main {
    public static void main(String[] args) {
        int[] v1 = {1,2,3,4,5,10,10,10,6,2,1};
        int[] v2 = {1,2};
        int[] bhijos= {0,0,0};
        Booleano bexito = new Booleano(false);
        Algoritmo algo = new Algoritmo();
        //algo.hayrepartoEquitativo(v1,bhijos,0,bexito);
        algo.hayrepartoEquitativo(v2,bhijos,0,bexito);

    }
}

/*
Determine if there is an equitable distribution among three children of certain assets
 */



/*      El 10 de agosto del año 843, Lotario I, Luis el Germánico
        y Carlos el Calvo (hijos de Ludovico Pio y nietos de Carlomagno) plantean en
        Verdún la posibilidad de llegar a un pacto (el conocido como tratado de Verdún)
        para repartir la vasta herencia de Carlomagno y poner así fin a la larga guerra
        civil carolingia. Con el fin de facilitar el acuerdo, se nos pide implementar un
        algoritmo de backtracking que permita determinar si es posible realizar un
        reparto equitativo:
        boolean hayRepartoEquitativo(int[] bienes)
        donde:
        • bienes: Array donde se describen los valores de los bienes que los tres
        herederos plantean repartirse.
        • La función debe devolver si es posible realizar un reparto equitativo, es
        decir, si los tres nietos de Carlomagno pueden obtener exactamente el
        mismo valor en bienes.
        Se pide:
        Implementar un algoritmo en Java, basado en el esquema de backtracking, que
        permita determinar si existe un reparto equitativo de los bienes entre los tres
        herederos. Deberá implementarse el código de la función hayRepartoEquitativo,
        así como todos los métodos adicionales que se consideren necesarios. */

