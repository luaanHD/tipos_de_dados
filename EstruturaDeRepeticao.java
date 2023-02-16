public class EstruturaDeRepeticao {
    /* Exercício 1
    public static void main(String[] args) {
        for(int i=150;i<=300;i++){
            System.out.println(i);
        }
    } */

    /* Exercício 2 
    public static void main(String[] args) {
        int soma=0;
        for(int i=1;i<=1000;i++){
            soma = soma + i;
        }
        System.out.println(soma);
    }
    */

    /* Exercício 3
    public static void main(String[] args) {
        for(int i =3; i<100; i+=3){
            System.out.println(i);
        }
    }
    */


    /* Exercício 4 */
    public static void main(String[] args) {
        int fatResult = 1;
      for(int j=0;j<=10;j++){
        for(int i=j;i>=1;i--){
            if(i == 0){
                fatResult = 1;
                break;
            } else{
                fatResult = i * fatResult;
            }
        }
        //System.out.println(fatResult);
        System.out.println("O fatorial de "+j +"="+fatResult);
       
        fatResult = 1;
    }
    
}
}
