package javaBase.lemon.day6;

public class HomeWork {
    public static void main(String[] args) {
        String str ="Tom:20|Jack:22|Rose:24";

        System.out.println(OverTurn(str));

//        String[] str2=str.split("\\|");
//        for(int i=0;i<str2.length;i++){
//            String[] str3=str2[i].split(":");
//            for(int j=0;j< str3.length;j++){
//                if(j==0){
//                    System.out.print("姓名： "+str3[j]);
//                }else if(j==1){
//                    System.out.println("   年龄： "+str3[j]);
//                }
//
//            }
//
//        }
    }

    public static String OverTurn(String str){
        String[] str5=str.split("");
        int d =str5.length/2;
        for (int i = 0; i < d; i++) {
            String aa=str5[i];
            str5[i]=str5[str5.length-1-i];
            str5[str5.length-1-i]=aa;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str5.length; i++) {
            sb.append(str5[i]);
        }
        String sb1 = sb.toString();



        return sb1;
    }

}
