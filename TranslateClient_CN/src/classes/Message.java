package classes;

public class Message implements java.io.Serializable {
    public static enum Message_Type {START,REQUEST,ANSWER}
    
    public Message_Type type;
    public Object content;
    public Message(Message_Type t)
    {
        this.type=t;
    } 
}
