package adapter;

public class ChatAdapterDemo {
    public static void main(String[] args) {
        LegacyChatService legacy = new LegacyChatService();
        ChatService adapter = new ChatServiceAdapter(legacy);
        adapter.sendMessage("Hello world!");
    }
}