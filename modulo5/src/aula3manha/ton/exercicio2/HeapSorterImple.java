package modulo5.src.aula3manha.ton.exercicio2;

import java.util.Comparator;

public class HeapSorterImple<T> implements Sorter<T>{
    @Override
    public void sort(T[] arr, Comparator<T> c) {
        for( int i = arr.length / 2; i >= 0; i-- )  /* buildHeap */
            percDown( arr,c, i, arr.length );
        for( int i = arr.length - 1; i > 0; i-- )
        {
            swapReferences( arr, 0, i );            /* deleteMax */
            percDown( arr, c , 0, i );
        }

    }

    private static int leftChild( int i )
    {
        return 2 * i + 1;
    }

    private void percDown(T[] a ,Comparator <T> c, int i, int n )
    {
        int child;
        T tmp;

        for( tmp = a[ i ]; leftChild( i ) < n; i = child )
        {
            child = leftChild( i );
            if( child != n - 1 && c.compare(a[ child ], a[ child + 1 ])< 0 )
                child++;
            if( c.compare(tmp, a[ child ]) < 0 )
                a[ i ] = a[ child ];
            else
                break;
        }
        a[ i ] = tmp;
    }

    public static final void swapReferences( Object [ ] a, int index1, int index2 )
    {
        Object tmp = a[ index1 ];
        a[ index1 ] = a[ index2 ];
        a[ index2 ] = tmp;
    }


}
