import java.util.*;

/**
 * StringCompression
 * 这道题跟之前有一个题的解题思路差不多
 * 就是固定0下表的元素，然后开始对比，设一个计数器count，如果相同则自增
 * 然后把计数器拆开成chararray放进原数组里
 */
public class StringCompression {
    public int compress(char[] chars) {
        int indexAns = 0, index = 0;
        while(index < chars.length){
            char currentChar = chars[index];
            int count = 0;
            while(index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if(count != 1)
                for(char c : Integer.toString(count).toCharArray()) 
                    chars[indexAns++] = c;
        }
        return indexAns;
    }

    public static void main(String[] args) {
        StringCompression foo = new StringCompression();
        char[] chars = {'a'};
        System.out.println(foo.compress(chars));
    }
}