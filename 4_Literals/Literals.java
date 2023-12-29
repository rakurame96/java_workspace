public class Literals {
    public static void main(String[] args)
    {
        int bin_num = 0b0101;

        int int_a = 0x5;
        
        int num = 1000000000;
        int num_a = 1_00_00_00_000;

        System.out.println(bin_num);
        System.out.println(int_a);
        System.out.println(num);
        System.out.println(num_a);

        char c = 'a';
        c++;
        System.out.println(c);
    }
}
