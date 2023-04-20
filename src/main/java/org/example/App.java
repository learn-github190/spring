package org.example;

import config.Config;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class App {
    public static void main( String[] args ) {
//        CommentRepository dbCommentRepository =
//                new DBCommentRepository();
//
//        CommentNotificationProxy emailCommentNotificationProxy =
//                new EmailCommentNotification();
//
//        CommentService commentService = new CommentService(
//                dbCommentRepository,
//                emailCommentNotificationProxy
//        );

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

        CommentService commentService = ac.getBean(CommentService.class);

        Comment amerComment = new Comment("Amer", "I am Amer and this is my comment!");

        commentService.publishComment(amerComment);
    }
}
