package proxiess;

import model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
