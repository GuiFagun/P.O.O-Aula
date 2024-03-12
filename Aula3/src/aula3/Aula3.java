/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula3;

/**
 *
 * @author alunolab10
 */
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bois;
        float pesoboi;
        float maior = 0;
        float menor = 0;
        float soma = 0;
        
        do{
            bois = InOut.leInt("Digite a quantidade de bois: ");
        }
        while(bois <= 0);
        
        for(int i = 0; i < bois; i++){
            pesoboi = InOut.leInt("Digite o peso do " + (i+1) + "° boi: ");
            soma += pesoboi;
            
            if(pesoboi == 0){
                InOut.MsgDeAviso("Peso nulo", "Peso invalido.");
                System.exit(0);
            }
            else if(pesoboi > maior){
                maior = pesoboi;
                if(i < 1)
                    menor = maior;
                }
            else if(pesoboi <  menor){
                menor = pesoboi;
            }          
        }
        
        float media = soma / bois;
        
        InOut.MsgDeInformacao("Media do Rebanho", "A média de peso do rebanho é " + media + " kg.");
        InOut.MsgDeInformacao("Boi mais gordo", "O boi mais gordo tem " + maior + " kg.");
        InOut.MsgDeInformacao("Boi mais magro", "O boi mais  magro tem " + menor + " kg.");
    }
}

