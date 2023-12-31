package pjh5365.linuxserviceweb.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.socket.WebSocketSession;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Setter
@Getter
public class ChatRoomDto {
    private String roomId;
    private String roomName;
    private String creator;
    private Set<WebSocketSession> sessions = new HashSet<>();

    public static ChatRoomDto createRoom(String roomName, String creator) {
        ChatRoomDto room = new ChatRoomDto();
        room.roomId = UUID.randomUUID().toString();
        room.setRoomName(roomName);
        room.setCreator(creator);

        return room;
    }
}
