public class Main {
    public static void main(String[] args) throws Exception{
        Livro livro = new Livro(2021, "The Redemption of Wolf 302", "Rick McIntyre");
        System.out.println("\nTítulo: "+livro.getTitulo()+"\nAutor(a): "+livro.getAutor()+"\nAno: "+livro.getAno());
        System.out.println("\n");
    }
}