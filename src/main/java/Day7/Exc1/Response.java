package Day7.Exc1;

import java.util.Map;

public class Response {
    int status;
    Map<String, Object> body;

    public Response(int status, Map<String, Object> body){
        this.status = status;
        this.body = body;
    }

    public Map<String, Object> getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status=" + status +
                ", body=" + body +
                '}';
    }
}

