public class bbbagas_33 {
    public static void main(String[] args) {
        String[] hewan = {"kepiting", "dog", "cat", "buaya", "ikan"};
        System.out.println("lebih dari 4 huruf: ");
        for (int i = 0; i < hewan.length; i++) {
            if (hewan[i].length() > 4) {
                System.out.println(hewan[i]);
            }
        }
    }
}
