package proxies;

import model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PUSH")
public class CommentPushNotification implements CommentNotificationProxy {
    public void sendComment(Comment comment) {
        System.out.println("Pushing notification: ");
        System.out.println(comment + "...");
    }
}
