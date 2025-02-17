package chapter13.lecture;

import java.util.List;
import java.util.Vector;

class Post {
    String subject;
    String content;
    String writer;

    public Post(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Post{" +
                "subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}

public class VectorExample {
    public static void main(String[] args) {
        List<Post> board = new Vector<Post>();

        board.add(new Post("제목1", "내용1", "글쓴이1"));
        board.add(new Post("제목2", "내용2", "글쓴이2"));
        board.add(new Post("제목3", "내용3", "글쓴이3"));
        board.add(new Post("제목4", "내용4", "글쓴이4"));
        board.add(new Post("제목5", "내용5", "글쓴이5"));


        board.remove(2);
        board.remove(3);

        System.out.println(board);
    }
}
