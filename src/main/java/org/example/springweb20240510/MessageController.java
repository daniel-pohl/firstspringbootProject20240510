package org.example.springweb20240510;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MessageController {

    private List<Message> messagesList = new ArrayList<>();


    @PostMapping("/messages")
    public Message addMessage(@RequestParam String id, @RequestParam String name, @RequestParam String message) {
        Message newMessage = new Message(id, name, message);
        messagesList.add(newMessage);
        return newMessage;
    }

    @GetMapping("/messages")
    public List<Message> returnAllMessages() {
        return messagesList;
    }

    @DeleteMapping("/messages/{id}")
    public String removeItem(@PathVariable String id) {

        for (Message message : messagesList) {
            if (message.getId().equals(id)) {
                messagesList.remove(message);
                return "Item with ID " + id + " removed successfully.";
            }
        }
        return "Message with id " + id + " not found.";

    }
}
