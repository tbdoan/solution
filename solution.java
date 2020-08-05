class Main {
  public static void main(String[] args) {
    System.out.println(encrypt("chillout"));
  }

  public static String encrypt(String input) {
    String output = "";
    input = input.replaceAll(" ", "");
    int upperdim = (int) Math.ceil(Math.sqrt(input.length())); 
    int lowerdim = (int) Math.floor(Math.sqrt(input.length()));
    if(upperdim * lowerdim < input.length()) {
      lowerdim = upperdim;
    } 
    // num_rows = lowerdim, num_cols = upperdim 
    for(int i = 0; i < upperdim; i++) {
      int j = 0;
      while( j * upperdim + i < input.length()) {
        output = output + input.charAt(j * upperdim + i);
        j++;
      }
      output = output + " ";
    }
    return output;
  }
}
