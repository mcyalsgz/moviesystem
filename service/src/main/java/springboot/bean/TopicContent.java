package springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class TopicContent {
    private List<TopicMessage> topicMessageList;
    private List<TopicMessageReply> topicMessageReplyList;
}