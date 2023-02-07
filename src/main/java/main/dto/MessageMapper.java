package main.dto;

import main.model.Message;

public class MessageMapper {
    public static DtoMessage messageMap(Message message) {
        DtoMessage dtoMessage = new DtoMessage();
        dtoMessage.setText(message.getMessage());
        dtoMessage.setDateTime(message.getDateTime().toString());
        dtoMessage.setUsername(message.getUser().getName());
        return dtoMessage;
    }
}
