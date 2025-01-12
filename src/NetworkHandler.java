import java.net.Socket;

public interface NetworkHandler {

    void initialiseServer(int portNumber);

    Socket acceptIncomingClient();

    String waitForDataFromClient(Socket clientSocket);

    void sendResponseToClient(String response, Socket clientSocket);

    String sendDataToServer(String serverName, int portNumber, String data);

    int initialiseClientSocket(String serverName, int portNumber);

    String receiveDataFromServer(String serverName, int portNumber, String request);

    void closeResources();

    String handleTestRequest(String serverName, int portNumber, String request);

    public boolean checkClientSocketIsClosed();
}
