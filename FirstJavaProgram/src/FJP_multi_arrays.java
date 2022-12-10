public class FJP_multi_arrays {
    public static void main(String[] args) {
        // Flats in a 4-storey building and each floor with 6 flats
        int[][] flats = new int[4][6];

        for (int i = 0; i < flats.length-1; i++){
            for (int j = 0; j < flats[i].length; j++){
                flats[i][j] = i+j;
                System.out.println(flats[i][j]);
            }
        }
    }
}
