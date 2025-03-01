package divisibilidad;

import java.math.BigInteger;

public class Divisibilidad {

    public static boolean divisiblePor2(BigInteger num) {
        return num.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO);
    }

    public static boolean divisiblePor3(BigInteger num) {
        BigInteger suma = BigInteger.ZERO;
        BigInteger ten = BigInteger.TEN;
        BigInteger temp = num.abs();
        while (temp.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] divmod = temp.divideAndRemainder(ten);
            BigInteger digito = divmod[1];
            suma = suma.add(digito);
            temp = divmod[0];
        }
        return suma.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO);
    }

    public static boolean divisiblePor5(BigInteger num) {
        return num.mod(BigInteger.valueOf(5)).equals(BigInteger.ZERO);
    }

    public static boolean divisiblePor7(BigInteger num) {
        BigInteger mod7 = BigInteger.valueOf(7);
        BigInteger factor = BigInteger.ONE;             // Inicializamos factor: 10^0 mod 7 ≡ 1
        BigInteger acumulado = BigInteger.ZERO;          // Acumulador para la suma ponderada
        BigInteger ten = BigInteger.TEN;
        BigInteger temp = num.abs();

        while (temp.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] divmod = temp.divideAndRemainder(ten);
            BigInteger digito = divmod[1];
            temp = divmod[0];
            acumulado = acumulado.add(digito.multiply(factor)).mod(mod7);
            factor = factor.multiply(ten).mod(mod7);
        }

        return acumulado.mod(mod7).equals(BigInteger.ZERO);
    }

    public static boolean divisiblePor11(BigInteger num) {
        BigInteger sumaPar = BigInteger.ZERO;
        BigInteger sumaImpar = BigInteger.ZERO;
        int i = 0;
        BigInteger ten = BigInteger.TEN;
        BigInteger temp = num.abs();

        while (temp.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] divmod = temp.divideAndRemainder(ten);
            BigInteger digito = divmod[1];
            temp = divmod[0];

            if (i % 2 == 0) {
                sumaPar = sumaPar.add(digito);
            } else {
                sumaImpar = sumaImpar.add(digito);
            }
            i++;
        }

        return (sumaPar.subtract(sumaImpar)).mod(BigInteger.valueOf(11)).equals(BigInteger.ZERO);
    }
}






