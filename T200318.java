import java.util.Arrays;
import java.util.Scanner;

public class T200318 {

    public static int[] copyArray(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        return array2;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("拷贝前array：" + Arrays.toString(array));
        //拷贝前array：[1, 2, 3, 4, 5]
        int[] ret = Arrays.copyOf(array, array.length);
        ret[0] = 999;
        System.out.println("拷贝后ret修改:" + Arrays.toString(ret));
        //拷贝后ret修改:[999, 2, 3, 4, 5]
        System.out.println("拷贝后array：" + Arrays.toString(array));
        //拷贝后array：[1, 2, 3, 4, 5]
    }

        public static void main5 (String[]args){
            String[] strings = new String[8];//字符串数组（8为数组维）
            Scanner scanner = new Scanner(System.in);
            //"1 12 31 4 5 6 7 8"
            for (int i = 0; i < strings.length; i++) {
                strings[i] = scanner.next();
                //字符串数组输入
            }
            System.out.println(Arrays.toString(strings));
            //["1, 12, 31, 4, 5, 6, 7, 8"]
            //数组大小与数组维相等
        }

        public static void main4 (String[]args){
            //输入字符串进数组（大体方向）
            Scanner scanner = new Scanner(System.in);
            //nextLine: 读一行
            String str = scanner.nextLine(); //"1 12 31 4 5 6 7 8"
            //1、根据空格 先分割字符
            //2、拿到每一个字符12 ->数字12
            int[] array = new int[4];
            for (int i = 0; i < array.length; i++) {
                array[i] = 1;
            }
        }

        public static void swap (int[] array){
            int tmp = array[0];
            array[0] = array[1];
            array[1] = tmp;
            //数组传的是地址，因此无需返回值也能改变数组内容
        }
        public static void main3 (String[]args){
            //浅拷贝：两个引用同时引用一个对象
            //交换两个数组
            int[] arr = {3, 5};
            swap(arr);
            System.out.println(Arrays.toString(arr));//[5, 3]
        }

        public static void main2 (String[]args){
            //null：引用类型对应的0值
            int[] array = {1, 2, 3, 4, 5};
            array = null;
            System.out.println(array[0]);
            System.out.println(array.length);
            //Exception in thread "main" java.lang.NullPointerException
            //空指针异常
        }

        public static void print ( int[] array){
            array[1] = 9999;
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
                //1 9999 3 4 5 6 7 8 9 10
            }
            System.out.println();
        }
    /*public static void func(int a) {
        a = 888;
        System.out.println(a);//888
    }*/
        //没有返回值，则取值与main方法中变量无关
        public static int func ( int a){
            a = 888;
            return a;
        }
        public static void main1 (String[]args){
            int b = 10;
            //func(b);
            //System.out.println(b);//10
            System.out.println(func(b));//888

            int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            print(array2);
            System.out.println("================");
            System.out.println(Arrays.toString(array2));
            //[1, 9999, 3, 4, 5, 6, 7, 8, 9, 10]
            //Arrays.toString: 字符串形式表现数组内容
            //数组是引用类型，相当于C中的指针，传递的形参是地址
            //在方法中改变数组内容，则main方法中的内容随之改变
        }
}
