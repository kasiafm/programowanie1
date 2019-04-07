package zadaniaArrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Cwiczenia arrays");

        int[] testArr = {1,2,4,5,6};

        myArray ma = new myArray();
        myArray ma2 = new myArray(testArr);

        ma.print();
        ma2.print();
        testArr[3] = 1234;
        System.out.println(testArr[3]);
        System.out.println(ma.lenght() + ", " + ma2.lenght());

        System.out.println(ma.find(6));
        System.out.println(ma2.find(2));

        System.out.println(ma.pick(4));
        System.out.println(ma2.pick(3));

        ma.push(17);
        ma.print();
    }

    }

