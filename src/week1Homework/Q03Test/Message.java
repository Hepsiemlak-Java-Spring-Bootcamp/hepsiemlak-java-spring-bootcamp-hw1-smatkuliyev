package week1Homework.Q03Test;

public class Message {
    private String msgTitle;
    private String content;
    private User sender;
    private User reciever;

    public Message(String msgTitle, String content, User sender, User reciever) {
        this.msgTitle = msgTitle;
        this.content = content;
        this.sender = sender;
        this.reciever = reciever;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReciever() {
        return reciever;
    }

    public void setReciever(User reciever) {
        this.reciever = reciever;
    }

    @Override
    public String toString() {
        return "msgTitle='" + msgTitle + '\'' +
                ", content='" + content + '\'' +
                ", sender=" + sender +
                ", reciever=" + reciever;
    }
}
