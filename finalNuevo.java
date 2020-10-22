import java.util.*;
import java.util.Arrays; 

public class finalNuevo{


	public static void menu()
	{

        opcion_bandera = 0;
		String banderas[] = ConsoleFile.read("info_banderas.csv");
		int indices[] = crearIndices(banderas.length/20);
		//System.out.println(Arrays.toString(indices));
		//System.out.println(Arrays.toString(indices));


		opcion_bandera = subMenuSeleccionBandera(indices);
		System.out.println("");
		System.out.print("Esta es la bandera de ");
		System.out.println(imprimirInformacionBandera(banderas,indices[opcion_bandera]));
		imprimirGraficoBandera(banderas,indices[opcion_bandera]);
		
	}




	public static int subMenuSeleccionBandera(int[] indices)
	{
		int opc = 0;

		do{

			System.out.println(" __    __     ____     _____         ____        __    __    _____   __    __     ____     ______      _____     ____    _______ ");
			System.out.println("(  \\  /  )   / __ \\   (_   _)       (    )       ) )  ( (   / ____\\  ) )  ( (    (    )   (   __ \\    (_   _)   / __ \\   \\     / ");
			System.out.println(" \\ (__) /   / /  \\ \\    | |         / /\\ \\      ( (    ) ) ( (___   ( (    ) )   / /\\ \\    ) (__) )     | |    / /  \\ \\   \\   /  ");
			System.out.println("  ) __ (   ( ()  () )   | |        ( (__) )      ) )  ( (   \\___ \\   ) )  ( (   ( (__) )  (    __/      | |   ( ()  () )   ) (   ");
			System.out.println(" ( (  ) )  ( ()  () )   | |   __    )    (      ( (    ) )      ) ) ( (    ) )   )    (    ) \\ \\  _     | |   ( ()  () )   \\_/   ");
			System.out.println("  ) )( (    \\ \\__/ /  __| |___) )  /  /\\  \\      ) \\__/ (   ___/ /   ) \\__/ (   /  /\\  \\  ( ( \\ \\_))   _| |__  \\ \\__/ /     _    ");
			System.out.println(" /_/  \\_\\    \\____/   \\________/  /__(  )__\\     \\______/  /____/    \\______/  /__(  )__\\  )_) \\__/   /_____(   \\____/     (_)   ");
			System.out.println("                                                                                                                                 ");
			System.out.println("");
			System.out.println("");
			
			
			System.out.println("    __     _                                  _      __                 __             __ _  __                      __    ");
			System.out.println("   / /_   (_)___   ____  _   __ ___   ____   (_)____/ /____     ____ _ / /  ___   ____/ /(_)/ /_ ____   _____   ____/ /___ ");
			System.out.println("  / __ \\ / // _ \\ / __ \\| | / // _ \\ / __ \\ / // __  // __ \\   / __ `// /  / _ \\ / __  // // __// __ \\ / ___/  / __  // _ \\ ");
			System.out.println(" / /_/ // //  __// / / /| |/ //  __// / / // // /_/ // /_/ /  / /_/ // /  /  __// /_/ // // /_ / /_/ // /     / /_/ //  __/");
			System.out.println("/_.___//_/ \\___//_/ /_/ |___/ \\___//_/ /_//_/ \\__,_/ \\____/   \\__,_//_/   \\___/ \\__,_//_/ \\__/ \\____//_/      \\__,_/ \\___/ ");
			System.out.println("                                                                                                                           ");
			System.out.println("    __                       __                          __");
			System.out.println("   / /_   ____ _ ____   ____/ /___   _____ ____ _ _____ / /");
			System.out.println("  / __ \\ / __ `// __ \\ / __  // _ \\ / ___// __ `// ___// / ");
			System.out.println(" / /_/ // /_/ // / / // /_/ //  __// /   / /_/ /(__  )/_/  ");
			System.out.println("/_.___/ \\__,_//_/ /_/ \\__,_/ \\___//_/    \\__,_//____/(_)   ");
			System.out.println("");
			System.out.println("");



			System.out.println("Escoge la bandera que desees editar:");
			System.out.println("");
			System.out.println(" 1.Gran Bretana     15.Seychelles");
			System.out.println(" 2.Colombia         16.Gibraltar");
			System.out.println(" 3.Peru             17.Siria");
			System.out.println(" 4.Polonia          18.Republica Checa");
			System.out.println(" 5.Indosia          19.Libano");
			System.out.println(" 6.Italia")
			//// aca falta organizar el resto de las banderas
			System.out.println(" 10.Romania	    ");
			System.out.println(" 11.Alemania       ");
			System.out.println(" 12.Japon	    ");		
			System.out.println(" 13.Aland	    ");	
			System.out.println(" 14.Corea del Sur");

			// falta hacerle pull al csv de banderas actualizado
			System.out.println("");
			System.out.println("Recuerda ingresarla con su respectivo valor (entre 1-"+indices.length+")");
			opc = ConsoleInput.getInt();

			//opc = ConsoleInput.getInt();
		}while(opc<0 || opc==0 || opc>indices.length);

		return opc-1;
	}




	public static int[] crearIndices(int total)
	{
		int indices[] = new int[total];
		int contador = 0;
		for (int i=0;i<indices.length;i++) {
			indices[i] = contador;
			contador+=20;		
		}
		return indices;
	}

	public static String imprimirInformacionBandera(String[] banderas,int indice)
	{
		String fila[];

		String nombrepais = "";

		for (int i=indice;i<indice+20;i++ ) {
			if(i == indice)
			{
				fila = banderas[i].split(";");
				//System.out.println("Nombre pais: "+fila[0]);
                nombrepais = fila[0];
				/*System.out.println("Capital: "+fila[1]);
				System.out.println("Idioma: "+fila[2]);*/
			}
		}

		return nombrepais;
	}


	public static void imprimirGraficoBandera(String[] banderas, int indice)
	{

		for (int i=indice;i<indice+20;i++ ) 
		{
			banderanormal(banderas[i].split(";"));
		}
			/// bandera grande en asciii
		for (int i=indice;i<indice+20;i++ ) 
		{
			banderagrande(banderas[i].split(";"));
			banderagrande(banderas[i].split(";"));
		}

		System.out.println("");
		System.out.println("Esta es la misma bandera pero");
	 	System.out.println("pequeno") //poner esto en ascii

		for (int i=indice;i<indice+20;i++ ) 
		{
			if(i%2 == 0)
			{
              banderapequena(banderas[i].split(";"));
			} 
		}
         
        //invertido

		for (int i=indice;i<indice+20;i++ ) 
		{
			negativo(banderas[i].split(";"));
		}

       //// blando y negro ascii


		for (int i=indice;i<indice+20;i++ ) 
		{
			blancoynegro(banderas[i].split(";"));
		}

		//// aleatorio

		for (int i=indice;i<indice+20;i++ ) 
		{
                if(i%2 == 0)
                {
                	aleatorio(banderas[i].split(";"));
                }
                else
                {
                    negativo(banderas[i].split(";"));   
                }
		}
		System.out.println("");
		System.out.println("");
		System.out.println(" gracias por usar el editor");
		// poner eso en ascii tambien
		


			
	}


    public static void banderanormal(String fila[])
	{
		for (int i=0;i<fila.length;i++) 
		{	
	 		if(fila[i].equals("1"))
	 		{
	 			System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("2"))
	 		{
	 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("3"))
	 		{
	 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("4"))
	 		{
	 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("5"))
	 		{
	 			System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("6"))
	 		{
	 			System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
	 		}	
	 		if(fila[i].equals("7"))
	 		{
	 			System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
	 		}	
	 		if(fila[i].equals("8"))
	 		{
	 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
	 		}	
	 				

		}
		System.out.println(ConsoleColors.RESET);
	}


	public static void banderagrande(String fila[])
	{
		for (int i=0;i<fila.length;i++) 
		{	
	 		if(fila[i].equals("1"))
	 		{
	 			System.out.print(ConsoleColors.RED_BACKGROUND+"    ");
	 		}
	 		if(fila[i].equals("2"))
	 		{
	 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"    ");
	 		}
	 		if(fila[i].equals("3"))
	 		{
	 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"    ");
	 		}
	 		if(fila[i].equals("4"))
	 		{
	 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+"    ");
	 		}	
	 		if(fila[i].equals("5"))
	 		{
	 			System.out.print(ConsoleColors.GREEN_BACKGROUND+"    ");
	 		}
	 		if(fila[i].equals("6"))
	 		{
	 			System.out.print(ConsoleColors.PURPLE_BACKGROUND+"    ");
	 		}	
	 		if(fila[i].equals("7"))
	 		{
	 			System.out.print(ConsoleColors.CYAN_BACKGROUND+"    ");
	 		}	
	 		if(fila[i].equals("8"))
	 		{
	 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"    ");
	 		}		 		
		}
		System.out.println(ConsoleColors.RESET);
	}


	public static void banderapequena(String fila[])
	{
		for (int i=0;i<fila.length;i++) 
		{
			if(i%2 == 0)
			{
	 			if(fila[i].equals("1"))
	 			{
	 				System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
	 			}
	 			if(fila[i].equals("2"))
	 			{
	 				System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
	 			}
	 			if(fila[i].equals("3"))
	 			{
	 				System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
	 			}
	 			if(fila[i].equals("4"))
		 		{
		 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
	 			}
	 			if(fila[i].equals("5"))
	 			{
	 				System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
	 			}
	 			if(fila[i].equals("6"))
	 			{
	 				System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
	 			}	
	 			if(fila[i].equals("7"))
	 			{
	 				System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
	 			}	
	 			if(fila[i].equals("8"))
	 			{
	 				System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
	 			}			 		
			}
		}	
		System.out.println(ConsoleColors.RESET);
	}




	public static void negativo(String fila[])
	{

		for (int i=0;i<fila.length; i++) 
		{

	 		if(fila[i].equals("1"))
	 		{
	 			System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("2"))
	 		{
	 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("3"))
	 		{
	 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("4"))
	 		{
	 			System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("5"))
	 		{
	 			System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("6"))
	 		{
	 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
	 		}	
	 		if(fila[i].equals("7"))
	 		{
	 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
	 		}	
	 		if(fila[i].equals("8"))
	 		{
	 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
	 		}	

		}
		System.out.println(ConsoleColors.RESET);
	}


	public static void blancoynegro(String fila[])
	{

		for (int i=0;i<fila.length; i++) 
		{

	 		if(fila[i].equals("1"))
	 		{
	 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("2"))
	 		{
	 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("3"))
	 		{
	 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("4"))
	 		{
	 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("5"))
	 		{
	 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("6"))
	 		{
	 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
	 		}	
	 		if(fila[i].equals("7"))
	 		{
	 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
	 		}	
	 		if(fila[i].equals("8"))
	 		{
	 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
	 		}

		}
		System.out.println(ConsoleColors.RESET);
	}


	public static void aleatorio(String fila[])
	{

		for (int i=0;i<fila.length; i++) 
		{ 

			if(i%2 == 0)
			{

	 			if(fila[i].equals("1"))
	 			{
	 				System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
	 			}
	 			if(fila[i].equals("2"))
	 			{
	 				System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
	 			}
	 			if(fila[i].equals("3"))
	 			{
	 				System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
	 			}
	 			if(fila[i].equals("4"))
	 			{
	 				System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
	 			}
	 			if(fila[i].equals("5"))
	 			{
	 				System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
	 			}
	 			if(fila[i].equals("6"))
	 			{
	 				System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
	 			}	
	 			if(fila[i].equals("7"))
	 			{
	 				System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
	 			}	
	 			if(fila[i].equals("8"))
	 			{
	 				System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
	 			}
	 		}

	 		else
	 		{
	 			if(fila[i].equals("1"))
	 			{
	 				System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
	 			}
	 			if(fila[i].equals("2"))
	 			{
	 				System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
	 			}
	 			if(fila[i].equals("3"))
	 			{
	 				System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
	 			}
	 			if(fila[i].equals("4"))
	 			{
	 				System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
	 			}
	 			if(fila[i].equals("5"))
	 			{
	 				System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
	 			}
	 			if(fila[i].equals("6"))
	 			{
	 				System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
	 			}	
	 			if(fila[i].equals("7"))
	 			{
	 				System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
	 			}	
	 			if(fila[i].equals("8"))
	 			{
	 				System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
	 			}

	 		}

		}
		System.out.println(ConsoleColors.RESET);
	}



	public static void main(String[] args) 
    {
		menu();//Invocavión de la función
	}


}


