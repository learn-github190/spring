package proxiess;

import model.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotification implements CommentNotificationProxy {
    public void sendComment(Comment comment) {
        System.out.println("Sending email: ");
        System.out.println(comment + "...");
    }
}
