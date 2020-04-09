package labti;
class utama{
    public static void main(String[] args) {
        metodeku m ;
        m = new metodeku();
        m.cetak();
        System.out.println("Mencetak : "+m.cetakAngka(10));
    }
}
class metodeku{
    void cetak(){
        System.out.println("Mencetak INI ");
    }
    int cetakAngka(int a){
        return a;
    }
}           


