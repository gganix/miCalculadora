package entornos_desarrollo.calculadora;

/**
 * Hello world!
 *
 */
public class CalculadoraApp 
{
	public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Por favor, proporciona la operación (suma, resta, multiplicación o división) y dos números.");
            return;
        }

        String operacion = args[0];
        double num1 = Double.parseDouble(args[1]);
        double num2 = Double.parseDouble(args[2]);

        double resultado = 0.0;

        operaciones(operacion, num1, num2, resultado);
    }

	/**
	 * @param operacion nombre del tipo de operacion a realizar
	 * @param num1 primer numero de la operacion
	 * @param num2 segundo numero de la operacion
	 * @param resultado variable que guarda el resultado de la operacion de los 2 numeros
	 */
	private static void operaciones(String operacion, double num1, double num2, double resultado) {
		switch (operacion.toLowerCase()) {
            case "suma":
                resultado = num1 + num2;
                break;
            case "resta":
                resultado = num1 - num2;
                break;
            case "multiplicacion":
                resultado = num1 * num2;
                break;
            case "division":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida. Las operaciones permitidas son suma, resta, multiplicación y división.");
                return;
        }

        System.out.println("El resultado de la operación " + operacion + " es: " + resultado);
	}
}