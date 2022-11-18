package tablashash;

public class puevas {

    public static void main(String[] args) {
        TablasHash numeros = new TablasHash(51);
        numeros.Add("HOLA MUNDO ");
        numeros.Add("HOLA MUNDO ");
        numeros.Add("JOse ");
        numeros.Add("Maria ");
        numeros.Add("Morelos ");
        numeros.Add("Pavon ");
        numeros.Add("Ana ");
        numeros.Add("Betillo");
        numeros.Add("Carlengues");
        numeros.Add("cacahuetes ");
        numeros.Add("Francisco");
        numeros.Add("guey");

        numeros.Remove(97);
        System.out.println("/////");
        System.out.println(numeros);

        /*  for(int k=0;k<100;k++){
       //   System.out.println("/*"+k);
           if(numeros.primos(k)){
               System.out.println(k);
           } 
       
        }*/
    }

}
