package ejercicio1;

public class Ejercicio1 {
	
	
	public static void main(String[] args) {
		
		boolean sano = true, sintomas = true, contacto = true, cartillaVacunacion = true, nieve = true, lluvia = true, aforoEsqui = true,
				aforoSenderismo = true, nublado = true, restricciones = true, aforoBar = true, aforoPiscina = true;
		int temperatura = 0, humedad = 0;
		String opcion = obtenerPlan(sano, sintomas, contacto, cartillaVacunacion, nieve,
				lluvia, aforoEsqui, aforoSenderismo, nublado, restricciones, aforoBar, aforoPiscina, temperatura, humedad);
		System.out.println("La opcion recomendada es: " +opcion);
	}
	
	public static String obtenerPlan(boolean sano, boolean sintomas, boolean contacto, boolean cartillaVacunacion, boolean nieve,
			boolean lluvia, boolean aforoEsqui, boolean aforoSenderismo, boolean nublado, boolean restricciones, boolean aforoBar,
			boolean aforoPiscina, int temperatura, int humedad) {
		String opcion = "";
		if(sano && !sintomas && !contacto && cartillaVacunacion) {
			if(temperatura < 0 && humedad < 15 && (nieve || lluvia)) {
				opcion = "Casa.";
			}
			else if(temperatura < 0 && humedad < 15 && !(nieve || lluvia) && aforoEsqui) {
				opcion = "Esquiar.";
			}
			else if((0 <= temperatura &&  temperatura < 15) && !lluvia && aforoSenderismo) {
				opcion = "Senderismo.";
			}
			else if((15 <= temperatura &&  temperatura < 25) && !lluvia && !nublado && humedad < 60 && !restricciones) {
				opcion = "Turismo.";
			}
			else if((25 <= temperatura &&  temperatura < 35) && !lluvia && aforoBar) {
				opcion = "Irse de cañas.";
			}
			else if(temperatura > 30 && !lluvia) {
				opcion = "Playa";
				if(aforoPiscina) {
					opcion += "o piscina.";
				}
			}
		}
		else opcion = "No hay opcion.";
		return opcion;
	}
}
