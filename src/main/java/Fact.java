import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(value = { "user", "userUpvoted" })
public class Fact {
    private String _id;
    private String text;
    private String type;
    private int upvotes;
//    private Object userUpvoted;

    public Fact(
            @JsonProperty("_id") String _id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("upvotes") int upvotes
//            @JsonProperty("userUpvoted") Object userUpvoted
    ) {
        this._id = _id;
        this.text = text;
        this.type = type;
        this.upvotes = upvotes;
//        this.userUpvoted = userUpvoted;
    }

    public String get_id() {
        return _id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public int getUpvotes() {
        return upvotes;
    }

//    public Object getUserUpvoted() {
//        return userUpvoted;
//    }

    @Override
    public String toString() {
        return "Fact{" +
                "_id='" + _id + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}


