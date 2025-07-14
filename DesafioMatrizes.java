
import java.util.Scanner;

public class DesafioMatrizes {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Insira quantos alunos deseja inserir: ");
        int studantCount = input.nextInt();

        System.out.print("Insira a quantidade notas que cada alunos tem: ");
        int studantGrates = input.nextInt();

        double[][] studantsGradesArray = new double[studantCount][studantGrates];

        double average = 0;

        //set
        for(int lines = 0; lines < studantCount; lines++){
            for(int rows = 0; rows < studantGrates; rows++){
                System.out.printf("Insira a %d° nota do aluno[%d]: ",rows + 1, lines + 1);
                studantsGradesArray[lines][rows] = input.nextDouble(); 

                average += studantsGradesArray[lines][rows];

                input.nextLine();// clean buffer
            }
        }

        //show
        for(int lines = 0; lines < studantCount; lines++){
            for(int rows = 0; rows < studantGrates; rows++){
                System.out.printf("Nota[%d] do %d° estudante: " + String.format("%.02f",studantsGradesArray[lines][rows]) + "\n", rows + 1, lines + 1);
            }
        }

        System.out.printf("A media geral da turma é igual a: %.02f", average / (studantCount * studantGrates));

        input.close();
    }
}
