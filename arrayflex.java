import java.util.Scanner;

class arrayflex{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //judul
    System.out.println("---------------------------");
    System.out.println("-------- ARRAYFLEX --------");
    System.out.println("---------------------------");

    //input jumlah array
    System.out.print("Masukan Jumlah Array: ");
    int jumarray = scan.nextInt();

    //membuat array
    String[] array = new String[jumarray];

    System.out.println();
    //mengisi data ke array
    System.out.println("---------------------------");
    System.out.println("---------- INPUT ----------");
    System.out.println("---------------------------");
    System.out.println("Masukan Data..");
    for(int i=0 ; i<array.length ; i++){
      System.out.print("Data ke-"+ i +": ");
      array[i] = scan.next();
    }
    System.out.println();

    //menampilkan semua isi ke array
    System.out.println("---------------------------");
    System.out.println("--------- OUTPUT ----------");
    System.out.println("---------------------------");

    for(int i=0 ; i<array.length ; i++){
      System.out.println("Indeks ke-"+i+": "+ array[i]);
    }
  }
}
