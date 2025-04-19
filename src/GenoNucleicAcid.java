import java.util.Scanner;

public class GenoNucleicAcid {
    public static NucleicAcid nucleicAcidInput() {
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter name: ");
        String name = in.nextLine();
        System.out.printf("Enter chemical formula: ");
        String formula = in.nextLine();
        System.out.printf("Enter molMass: ");
        float molMass = in.nextFloat();
        System.out.printf("Enter density: ");
        float density = in.nextFloat();

        //in.close();

        return new NucleicAcid(name, formula, molMass, density);
    }

    public static void main(String[] args) {
        NucleicAcid nuc1 = nucleicAcidInput();
        NucleicAcid nuc2 = nucleicAcidInput();
        NucleicAcid nuc3 = nucleicAcidInput();
        NucleicAcid nuc4 = nucleicAcidInput();
        NucleicAcid nuc5 = nucleicAcidInput();
    }
}
/*
Enter name: Cytosine
Enter chemical formula: C4H5N3O
Enter molMass: 111.10
Enter density: 1.55
Enter name: Adenine
Enter chemical formula: C5H5N5
Enter molMass: 135.13
Enter density: 1.6
Enter name: Guanine
Enter chemical formula: C5H5N5O
Enter molMass: 151.13
Enter density: 2.2
Enter name: Thymine
Enter chemical formula: C5H6N2O2
Enter molMass: 126.115
Enter density: 1.223
Enter name: Uracil
Enter chemical formula: C4H4N2O2
Enter molMass: 112.08676
Enter density: 1.32

Process finished with exit code 0
 */