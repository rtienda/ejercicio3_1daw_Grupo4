package ejercicio3;

import java.util.*;

public class HistoriaDeUnRepositorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto = new Scanner(System.in);

		System.out.println("R:Hace un buen dia para echarse una siesta");
		System.out.println("Pero me tome un te y sali con la bici");
		System.out.println("Cuando estaba saliendo me cai por una alcantarilla");
		System.out.println("Y se me rompio el movil");
		System.out.println("Despues un hombre me robo la cartera");
		System.out.println("Me rompi la rodilla por 4 partes y dios que dolor");
		System.out.println("una rodilla que ya me habia operado el a�o pasado");
		System.out.println("R:Me rompi la rodilla por 4 partes y dios que dolor");
		System.out.println("R:Grite muchisimo pero nadie me oia");
		System.out.println("R:Estaba muy nervioso y empece a llorar del dolor");
		System.out.println("Me rompi la rodilla por 4 partes y dios que dolor");
		System.out.println("Fui a urgencias y alli me encontre a Roger");
		System.out.println("Roger es un tipo majo");

		System.out.println("Te gusto la historia?");
		System.out.println("SI o NO");
		
		String respuesta = texto.nextLine();

		if (respuesta.equalsIgnoreCase("Si")) {

			System.out.println("Nos alegramos que te haya gustado :3");

		} else if (respuesta.equalsIgnoreCase("No")) {
			System.out.println("Pues es lo que hay crack.");
		} else {
			System.out.println("Mira no te entiendo XD");
		}

	}
}
