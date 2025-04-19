import java.util.Scanner;

public class GenomeInput {
    public static HumanGenome genomeInput() {
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter genome name: ");
        String genomeName = in.nextLine();
        System.out.printf("Enter count of genes: ");
        int countGenes = in.nextInt();
        in.nextLine();
        System.out.printf("Enter count of chromosomes: ");
        int countChromo = in.nextInt();
        in.nextLine();
        System.out.printf("Enter count of cells: ");
        int countCells = in.nextInt();
        in.nextLine();

        //in.close();

        return new HumanGenome(genomeName, countGenes, countChromo, countCells);
    }

    public static void main(String[] args) {
        HumanGenome BoKatan = genomeInput();
        HumanGenome Koska = genomeInput();
        HumanGenome Axe = genomeInput();
    }
}
