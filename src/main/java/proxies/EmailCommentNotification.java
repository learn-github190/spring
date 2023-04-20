package proxies;

import model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EMAIL")
public class EmailCommentNotification implements CommentNotificationProxy {
    public void sendComment(Comment comment) {
        System.out.println("Sending email: ");
        System.out.println(comment + "...");
    }
}
