package repositories;

import model.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository implements CommentRepository {
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: ");
        System.out.println(comment + "...");
    }
}
