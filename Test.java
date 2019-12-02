
  a、合并两个有序的数组 如int[] array1 = {1,3,6,9}  int[] array2 = {2,4,6,8}，合并为一个
  有序的。合并之后的结果：1,2,3,4,6,6,9
b、字符串转化（压缩）   “aabbccdaa” -> "2a2b2c1d2a" 
c、题目：字符串： i am student 逆置 为  student  am i

a.
public class Test {
    public static void main(String[] args) {
        int[] arr1={1,3,6,9};
        int[] arr2={2,4,6,8};
        disPlay(merge(arr1,arr2));
    }
    public static int[] merge(int[] arr1,int[] arr2){
        int[] res=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int count=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
                res[count++]=arr1[i++];
            }else{
                res[count++]=arr2[j++];
            }
        }
        if(i==arr1.length){
            while(j!=arr2.length){
                res[count++]=arr2[j++];
            }
        }else{
            while(i!=arr1.length){
                res[count++]=arr1[i++];
            }
        }
        return res;
    }

    public static void disPlay(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}


b.
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
            System.out.println(func(str));
        
    }
    
    public static String func(String str){
        String s="";
        int l=0;
        for(int r=0;r<=str.length();r++){
            if(r==str.length()||str.charAt(r)!=str.charAt(l)){
                    s+=(r-l);
                s+=str.charAt(r-1);
                l=r;
            }
        }
        return s;
    }
}


c.



d.
写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(reverse(str));
    }
    
    public static String reverse(String str){
        if(str.equals("")){
            return null;
        }
        char[] res=str.toCharArray();
        int l=0;
        int r=res.length-1;
        while(l<r){
            char tmp=res[l];
            res[l++]=res[r];
            res[r--]=tmp;
        }
        return new String(res);
    }
}

e.
输入一串字符，请编写一个字符串压缩程序，将字符串中连续出现的重复字母进行压缩，
并输出压缩后的字符串。
例如：
aac 压缩为 1ac
xxxxyyyyyyzbbb 压缩为 3x5yz2b
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(func(str));
    }
    
    public static String func(String str){
        if(str.equals("")){
            return null;
        }
        String s="";
        int l=0;
        for(int r=0;r<=str.length();r++){
            if(r==str.length()||str.charAt(r)!=str.charAt(l)){
                if(r-l>1){
                    s+=(r-l-1);
                }
                s+=str.charAt(r-1);
                l=r;
            }
        }
        return s;
    }
}

