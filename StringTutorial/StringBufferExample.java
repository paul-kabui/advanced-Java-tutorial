package StringTutorial;
public class StringBufferExample {
    public static void main(String[] args){
        String str = "            hello";
        StringBuffer str2 = new StringBuffer(str);
        System.out.println(str.contains("ello"));
        System.out.println(str.concat(" world       ").strip());
        System.out.println(str2.append(" world").toString().strip());

        String name = System.console().readLine("Please enter your name:");
        System.out.println(name);

        String[] strArray = {"1","1234", "1234567","123456789"};
        for (String string : strArray) {
            System.out.format("%-3.3s\n",string);
        }
    }
}
