public class Strings {
    public static void main(String[] args) {                                                                                                                                                                                                        
        // mutable
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);

        // imutable
        String str = "Hello";
        str = str + " World";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        System.out.println(str);

    }
}
