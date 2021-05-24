package modulo5.src.aula3manha.ton.exercicio1;

public class SortUtil {
    public static <T> void sort (Precedente<T> arr []){
        Precedente<T> aux=null;

        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr.length-1; j++){
                if(0 < arr[j].precede((T) arr[j+1])){
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=aux;
                }
            }
        }
    }

}
