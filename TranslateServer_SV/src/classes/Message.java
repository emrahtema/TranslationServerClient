package classes;

public class Message implements java.io.Serializable {
    //mesaj tipleri enum 
    public static enum Message_Type {START,REQUEST,ANSWER}
    //matris gönder sonradan eklendi.
    //mesajın tipi
    public Message_Type type;
    //mesajın içeriği obje tipinde ki istenilen tip içerik yüklenebilsin
    public Object content;
    public Message(Message_Type t)
    {
        this.type=t;
    }
}
