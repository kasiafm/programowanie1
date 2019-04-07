package zadaniaArrays;

public class myArray {

    private int [] arr = new int [10];

    public void print () {

        for (int elem : this.arr) {
            System.out.print(elem + ", ");
        }
            System.out.println( );

    }

        // metoda dostpena z zewnatrz drukujaca cala tablice
        //konstruktor przyjmujacy tablice
        //konstruktor domyslny - nie przyjmuje zadnych parametorw wypelnia arr [0]


    myArray() {

        for (int elem : this.arr) {
            elem = 0;
        }
    }

    myArray( int[] inputArr){

           this.arr = new int [inputArr.length];
            int l = inputArr.length;
            for (int i = 0; i < l; i++)
                {
                    this.arr[i] = inputArr[i];
                }

            }

            public int lenght(){
                 return this.arr.length;
            }

            public int find (int toFind)
            {
                for (int i = 0; i < this.lenght(); i++){
                    if (this.arr[i] == toFind) return i;
                }

                return -1;
            }

            public int pick (int i){

                if (i<0 || i>this.lenght())
                {
                    throw new ArrayIndexOutOfBoundsException("Nieprawidlowy indeks");}
                    else
                    {
                        return this.arr[i];
                    }
                }
            }




