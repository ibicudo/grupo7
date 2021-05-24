package modulo5.src.aula3manha.exercicio1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pessoa ana = new Pessoa("12234456675", "Ana");
        Pessoa ingrid = new Pessoa("390251769898", "Ingrid");

        Pessoa[] pessoas = {ingrid, ana};

        SortUtil.sort(pessoas);

        System.out.println(Arrays.toString(pessoas));
        //Exer 7: Se tivermos uma classe que implementa a interface Precedente então conseguimos classificar qualquer uma matriz de qualquer tipo de dado

        Celular cel1= new Celular("998766627",ana);
        Celular cel2= new Celular("998766989",ingrid);

        Celular[] celulares= {cel1, cel2};
        SortUtil.sort(celulares);
        System.out.println(Arrays.toString(celulares));

    }
}
