/*
Домашнее задание к семинару №2:
1. Напишите программу на Java, чтобы найти наименьшее окно в строке, содержащей все символы другой строки.
2. Напишите программу на Java, чтобы проверить, являются ли две данные строки вращением друг друга.
3. *Напишите программу на Java, чтобы перевернуть строку с помощью рекурсии.
4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
6. *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
7. **Сравнить время выполнения пункта 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
*/

package HWJ2;

public class Task2 {
    
    public static boolean checkForContain(String str1, String str2){
        return str1.contains(str2);
    }

    public static boolean checkForRotation(String str1, String str2){
        StringBuilder strB1 = new StringBuilder(str1);
        StringBuilder strB2 = new StringBuilder(str2);
        String reverseStr1 = strB1.reverse().toString();
        String reverseStr2 = strB2.reverse().toString();
        return (str1.contains(str2) && reverseStr1.contains(reverseStr2)) || (reverseStr1.contains(str2) && str1.contains(reverseStr2));
    }

    public static String recursionReverse(String str){
        if (str.length() == 1){
            return str;
        } else{
            return str.charAt(str.length() - 1) + recursionReverse(str.substring(0, str.length() - 1));
        }
    }

    public static String buildSum(int num1, int num2){
        StringBuilder strBld = new StringBuilder();
        strBld.append(String.format("%d + %d = %d", num1, num2, num1 + num2));
        return strBld.toString();
    }
    public static String buildSubstraction(int num1, int num2){
        StringBuilder strBld = new StringBuilder();
        strBld.append(String.format("%d - %d = %d", num1, num2, num1 - num2));
        return strBld.toString();
    }
    public static String buildMult(int num1, int num2){
        StringBuilder strBld = new StringBuilder();
        strBld.append(String.format("%d * %d = %d", num1, num2, num1 * num2));
        return strBld.toString();
    }

    public static String replaceEqualsChar(String str){
        StringBuilder strBld = new StringBuilder(str);
        strBld.insert(strBld.indexOf("="), "равно");
        strBld.deleteCharAt(strBld.indexOf("="));
        return strBld.toString();
    }

    public static String anotherReplaceEqualsChar(String str){
        StringBuilder strBld = new StringBuilder(str);
        strBld.replace(strBld.indexOf("="), strBld.indexOf("=") + 1, "равно");
        return strBld.toString();
    }

    public static void main(String[] args) {
        String strOne = "Hello world";
        String strTwo = "Hello";
        int a = 3;
        int b = 56;

        System.out.println(checkForContain(strOne, strTwo));
        System.out.println(checkForRotation(strOne, strTwo));
        System.out.println(recursionReverse(strOne));
        System.out.println(buildSum(a, b));
        System.out.println(buildSubstraction(a, b));
        System.out.println(buildMult(a, b));
        System.out.println(replaceEqualsChar(buildSum(a, b)));
        System.out.println(anotherReplaceEqualsChar(buildMult(a, b)));
        System.out.println();

        String bigStr = "";
        for (int i = 0; i < 10000; i++) {
            bigStr += "=";
        }

        StringBuilder bigStrBld = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            bigStrBld.append("=");
        }

        long start = System.currentTimeMillis();
        bigStr = bigStr.replace("=", "равно");
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {
            bigStrBld.replace(bigStrBld.indexOf("="), bigStrBld.length() - 1, "равно");
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}