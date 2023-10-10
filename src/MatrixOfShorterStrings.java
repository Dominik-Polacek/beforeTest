public class MatrixOfShorterStrings {
    //In this exercise, you will write a method that takes two 2D matrices
    // of strings as input and returns a new matrix made of the shorter string at every position.
    // If strings has the same length, use string in the first input.
    //INPUT in TEST
    public static String[][] matrix(String[][] firstMatrice, String[][] secondMatrice) {

        //Najdi mi minimum (slova) v řádcích a sloupcích v první i druhé matici
        int numRows = Math.min(firstMatrice.length, secondMatrice.length);
        int numCols = Math.min(firstMatrice[0].length, secondMatrice[0].length);
        //výstup pro matici
        String[][] smallestWord = new String[numRows][numCols];

        //procházej 2D array
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                String firstWord = firstMatrice[i][j]; //uložím si první matici do Stringu
                String secondWord = secondMatrice[i][j]; //uložím si druhou matici do Stringu
                //podmínka na nalezení "nejkratšího" slova
                if (firstWord.length() <= secondWord.length()) {
                    smallestWord[i][j] = firstWord; //ulož mi do 2D pole 1.slovo
                } else {
                    smallestWord[i][j] = secondWord; //ulož mi do 2D pole 2. slovo
                }
            }

        }
        return smallestWord;
    }

}
