import java.util.LinkedList;

/**
 * Created by 时光与你 on 2017/5/10.
 */
public class youngLinkedList {
    public static void main(String[]args){
        //LinkedList类的基本使用
        LinkedList books = new LinkedList();
        //将字符串加入到队列的尾部
        books.offer("android江湖");
        //将一个字符串元素入栈
        books.push("会当凌绝顶");
        //将字符串元素添加到队列的头部
        books.offerFirst("一览众山小");
        for (int i =0;i < books.size();i++){
            System.out.println(books.get(i));
        }
        //访问并不删除队列的第一个元素
        System.out.println(books.peekFirst());
        //访问并不删除队列的最后一个元素
        System.out.println(books.peekLast());
        //采用出栈的方式将第一个元素pop出栈
        System.out.println(books.pop());
        System.out.println(books);
        //访问并删除最后一个元素
        System.out.println(books.pollLast());
        System.out.println(books);
    }
}
